package compile.spring.securityUpgrade.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class PageRequest<T> extends BasePage {

    private T[] orderBy;

}
