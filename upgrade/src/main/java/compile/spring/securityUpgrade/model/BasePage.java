package compile.spring.securityUpgrade.model;

import lombok.Data;

@Data
public class BasePage {

    private int pageNo;
    private int pageSize;
    private Order[] order;
}
