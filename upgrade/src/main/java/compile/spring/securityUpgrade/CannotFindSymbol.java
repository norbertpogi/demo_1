package compile.spring.securityUpgrade;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CannotFindSymbol {
    public static void main(String[] args) {
      List<String> list = Arrays.asList();

      if(Objects.nonNull(list) && list.size() > 0) {
          System.out.println("test1 : " + list.get(0));
      } else {
          System.out.println("null====: " + null);
      }

    }
}
