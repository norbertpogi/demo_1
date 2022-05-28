package compile.spring.securityUpgrade.config;

import com.google.common.base.CaseFormat;
import compile.spring.securityUpgrade.model.PageRequest;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.core.MethodParameter;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import org.springframework.web.bind.ServletRequestParameterPropertyValues;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.annotation.ModelFactory;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.ExtendedServletRequestDataBinder;
import org.springframework.web.util.WebUtils;

import javax.servlet.ServletRequest;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * spring have not generic request parameter and can't handle case convert
 */
public class PageRequestArgumentResolver implements HandlerMethodArgumentResolver {


    /**
     * only page for now
     */
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().equals(PageRequest.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, @Nullable ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, @Nullable WebDataBinderFactory binderFactory)
        throws Exception {

        ParameterizedType type = (ParameterizedType) parameter.getGenericParameterType();
        String name = ModelFactory.getNameForParameter(parameter);
        PageRequest attribute = new PageRequest();
        CaseFormatBinder caseformatBinder = new CaseFormatBinder(attribute, name,
                                                                 (Class) type.getActualTypeArguments()[0]);
        ServletRequest servletRequest = webRequest.getNativeRequest(ServletRequest.class);
        Assert.state(servletRequest != null, "No ServletRequest");
        caseformatBinder.bind(servletRequest);
        return attribute;
    }
}

/**
 * handle generic info and case format for PageRequest
 */
class CaseFormatBinder<T> extends ExtendedServletRequestDataBinder {

    private Class orderType;

    public CaseFormatBinder(@Nullable Object target, String objectName, Class<T> orderType) {
        super(target, objectName);
        this.orderType = orderType;
    }


    public void bind(ServletRequest request) {

        MutablePropertyValues mpvs = new ServletRequestParameterPropertyValues(request);
        Map<String, Object> objects = WebUtils.getParametersStartingWith(request, null);
        objects.entrySet().forEach(a -> {
            String converted = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, a.getKey());
            if (!converted.equals(a.getKey())) {
                if ("orderBy".equals(converted)) {
                    String[] values = a.getValue().toString().split(",");
                    T[] arrays = (T[]) Array.newInstance(orderType, values.length);
                    IntStream.range(0, values.length).forEach(index -> {
                        arrays[index] = (T) Enum.valueOf(orderType, values[index].toUpperCase());
                    });
                    PropertyValue propertyValue = new PropertyValue(converted, arrays);
                    propertyValue.setConvertedValue(arrays);
                    mpvs.addPropertyValue(propertyValue);
                    mpvs.removePropertyValue(a.getKey());
                } else {
                    PropertyValue propertyValue = new PropertyValue(converted, a.getValue());
                    mpvs.addPropertyValue(propertyValue);
                    mpvs.removePropertyValue(a.getKey());
                }
            }
        });
        addBindValues(mpvs, request);
        doBind(mpvs);
    }
}