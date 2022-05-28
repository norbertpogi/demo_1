package compile.spring.securityUpgrade.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PageResult<T, V> extends PageRequest<T> {

    private Iterable<V> results;
}
