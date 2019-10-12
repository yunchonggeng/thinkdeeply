package java8.core1;

import java8.core1.Apple;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ListFilter {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<Apple>();
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setWeight(170);
        appleList.add(apple);
        apple = new Apple();
        apple.setColor("green");
        apple.setWeight(140);
        appleList.add(apple);

        /** 第一版 **/
        System.out.println("green is ");
        System.out.println(filterGreenApples(appleList));

        System.out.println(">150 ");
        System.out.println(filterHeavyApples(appleList));
        /** 第一版end **/

        /** 第二版 **/
        System.out.println("lambda green is ");
        System.out.println(filterApples(appleList, Apple::isGreenApple));

        System.out.println("lambda >150 is ");
        System.out.println(filterApples(appleList, Apple::isHeavyApple));
        /** 第二版 end **/

        /** 第三版 **/
        System.out.println("lambda green is ");
        System.out.println(filterApples(appleList, (Apple a)->
                "green".equals(a.getColor())
        ));

        System.out.println("lambda >150 is ");
        System.out.println(filterApples(appleList, (Apple a) -> a.getWeight() > 150));
        /** 第三版 end**/

        /** 第四版 **/
        System.out.println("lambda stream >150 is ");
        System.out.println(appleList.stream().filter(a -> a.getWeight() > 150).collect(toList()));
        /** 第四版 end **/
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }


    public interface Predicate<T> {
        boolean test(T t);
    }

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
