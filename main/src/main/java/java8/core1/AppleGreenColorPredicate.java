package java8.core1;

/**
 * @program: main
 * @description: 过滤绿色
 * @author: william
 * @create: 2019-08-08 09:18
 **/
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
