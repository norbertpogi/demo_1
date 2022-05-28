package compile.spring.securityUpgrade.tools;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jooq.util.Definition;
import org.jooq.util.GeneratorStrategy;
import org.jooq.util.JavaWriter;
import org.jooq.util.TableDefinition;
import org.jooq.util.TypedElementDefinition;


public class JooqGenerator extends org.jooq.util.JavaGenerator {

    private static final String MASK = "\"******\"";
    private static Map<String, Set<String>> MASK_FIELDS = new HashMap<>();

    static {
        {
            Set<String> fields = new HashSet<>();
            fields.add("name");
            fields.add("code");
            MASK_FIELDS.put("Account", fields);
        }

        {
            Set<String> fields = new HashSet<>();
            fields.add("idNo");
            MASK_FIELDS.put("ChangeFormApp", fields);
        }

        {
            Set<String> fields = new HashSet<>();
            fields.add("bankName");
            fields.add("bankBranchId");
            fields.add("bankAccountNumber");
            fields.add("followUp");
            MASK_FIELDS.put("Claim", fields);
        }

        {
            Set<String> fields = new HashSet<>();
            fields.add("name");
            fields.add("cardHolderName");
            fields.add("address");
            fields.add("postalCode");
            MASK_FIELDS.put("Company", fields);
        }

        {
            // config columns here
            Set<String> fields = new HashSet<>();
            fields.add("contactNo");
            fields.add("contactName");
            fields.add("contactEmail");
            fields.add("authSignatoryName");
            fields.add("authSignatoryDesignation");
            fields.add("agentFirstName");
            fields.add("agentLastName");
            fields.add("agentCode");
            MASK_FIELDS.put("CompanyContact", fields);
        }

        {
            Set<String> fields = new HashSet<>();
            fields.add("data");
            MASK_FIELDS.put("GroupAsiaClaimStaging", fields);
        }

        {
            Set<String> fields = new HashSet<>();
            fields.add("data");
            MASK_FIELDS.put("GroupAsiaStaging", fields);
        }

        {
            Set<String> fields = new HashSet<>();
            fields.add("name");
            fields.add("contactPersonName");
            fields.add("email");
            MASK_FIELDS.put("Partner", fields);
        }

        {
            Set<String> fields = new HashSet<>();
            fields.add("idNo");
            fields.add("firstName");
            fields.add("lastName");
            fields.add("dob");
            fields.add("username");
            fields.add("password");
            fields.add("contactNo");
            MASK_FIELDS.put("Person", fields);
        }

        {
            Set<String> fields = new HashSet<>();
            fields.add("name");
            MASK_FIELDS.put("Product", fields);
        }

        {
            Set<String> fields = new HashSet<>();
            fields.add("name");
            fields.add("data");
            MASK_FIELDS.put("Quote", fields);
        }
    }


    public static void main(String[] args) throws Exception {
        org.jooq.util.GenerationTool.main(new String[]{"mmp.xml"});
    }


    @Override
    protected void generatePojoToString(Definition tableOrUDT, JavaWriter out) {
        final String className = getStrategy().getJavaClassName(tableOrUDT, GeneratorStrategy.Mode.POJO);

        out.println();

        out.tab(1).println("@Override");
        out.tab(1).println("public String toString() {");
        out.tab(2).println("%s sb = new %s(\"%s (\");", StringBuilder.class, StringBuilder.class, className);
        Set<String> masks = MASK_FIELDS.get(className);
        if (masks == null) {
            masks = Collections.emptySet();
        }
        out.tab(2).println();
        String separator = "";
        boolean first = Boolean.TRUE;
        for (TypedElementDefinition<?> column : ((TableDefinition) tableOrUDT).getColumns()) {
            final String columnMember = getStrategy().getJavaMemberName(column, GeneratorStrategy.Mode.POJO);
            final String columnType = getJavaType(column.getType());
            final boolean array = columnType.endsWith("[]");
//.append(\", \")
            if (first){
                out.tab(2).println("sb.append(\"%s :\" );", columnMember);
                first = Boolean.FALSE;
            }else {
                out.tab(2).println("sb.append(\",\").append(\"%s :\" );", columnMember);
            }
            //System.out.println(className + " - " + String.format("[%s|%s]", columnMember, columnType));


            if (array && columnType.equals("byte[]")) {
                out.tab(2).println("sb%s.append(\"[binary...]\");", separator);
            } else if (array) {
                out.tab(2).println("sb%s.append(%s.toString(%s));", separator, Arrays.class, columnMember);
            } else {
                if (masks.contains(columnMember)) {
                    if ("password".equals(columnMember)){
                        out.tab(2).println("sb%s.append(%s);", separator, MASK);
                    }else{
                        out.tab(2).println("sb%s.append(com.unchartedpartners.util.PiiMaskUtil.mask(%s));", separator, columnMember);
                    }
                } else {
                    out.tab(2).println("sb%s.append(%s);", separator, columnMember);
                }
            }
    //        separator = ".append(\", \")";
        }

        out.tab(2).println();
        out.tab(2).println("sb.append(\")\");");
        out.tab(2).println("return sb.toString();");
        out.tab(1).println("}");


    }

    @Override
    protected JavaWriter newJavaWriter(File file) {
        String className = file.getName().substring(0, file.getName().length() - 5);
        return new JavaWriter(file, generateFullyQualifiedTypes(), targetEncoding) {

            @Override
            public JavaWriter println(String string, Object... args) {
                if (args.length == 1 && args[0].equals("Repository")) {
                    /**
                     * make it easy to extend dao
                     */
                    super.println("@%s(value=\"%s\")", new Object[]{"Repository", "base" + className});
                    ref("org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean");
                    return super.println("@%s(name=\"%s\")", new Object[]{"ConditionalOnMissingBean",
                                                                          className.toLowerCase().substring(0, 1)
                                                                          + className.substring(1)});
                }
                /**
                 * jooq's dao autowire Configuration at construect, but we set Configuration in
                 * com.unchartedpartners.configrations.JooqSettingConfig , so remove it
                 */
                if (args.length == 1 && args[0].equals("Autowired")) {
                    return this;
                }
                /**
                 * make generated dao extend our own BaseDaoImpl
                 */
                if (args.length == 6 && args[1].equals("DAOImpl")) {
                    args[1] = "BaseDaoImpl";
                    ref("com.unchartedpartners.dao.BaseDaoImpl");
                }
                return super.println(string, args);
            }
        };
    }
}