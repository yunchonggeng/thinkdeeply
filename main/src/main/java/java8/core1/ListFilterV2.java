package java8.core1;

import java8.core1.Apple;
import java8.core1.AppleGreenColorPredicate;
import java8.core1.AppleHeavyWeightPredicate;
import java8.core1.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class ListFilterV2 {
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

        /** 第二版 **/
        System.out.println("lambda green is ");
        System.out.println(filterApples(appleList, new AppleGreenColorPredicate()));

        System.out.println("lambda >150 is ");
        System.out.println(filterApples(appleList, new AppleHeavyWeightPredicate()));
        /** 第二版 end **/
        //Runnable

//        /** 第三版 **/
//        System.out.println("lambda green is ");
//        System.out.println(filterApples(appleList, (Apple a)->
//                "green".equals(a.getColor())
//        ));
//
//        System.out.println("lambda >150 is ");
//        System.out.println(filterApples(appleList, (Apple a) -> a.getWeight() > 150));
        /** 第三版 end**/
//        Integer name=null;
//        if(10==name){
//            System.out.println("ok");
//        }
    }

    static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
