package lambdatest.stream;

import lombok.Data;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-10-02 02:06
 **/
@Data
public class Dish {
    private final  String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;
    public enum Type { MEAT, FISH, OTHER }
}
