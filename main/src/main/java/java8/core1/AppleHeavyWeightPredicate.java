package java8.core1;

/**
 * @program: main
 * @description: 过滤重量
 * @author: william
 * @create: 2019-08-08 09:17
 **/
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
