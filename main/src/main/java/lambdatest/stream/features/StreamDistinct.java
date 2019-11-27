package lambdatest.stream.features;

import lambdatest.stream.CreateData;
import lambdatest.stream.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-10-15 14:00
 **/
public class StreamDistinct {
    public static void main(String[] args) {
        List<Dish> menu= CreateData.createMenu();
        List<Integer> list= menu.stream().map(Dish::getCalories).distinct().collect(Collectors.toList());
        System.out.println(list);
        List<Integer> listsort= menu.stream().map(Dish::getCalories).distinct().sorted().collect(Collectors.toList());
        System.out.println(listsort);
        List<Integer> listsort2= menu.stream().map(Dish::getCalories).distinct().sorted((p1, p2) -> p2.compareTo(p1)).collect(Collectors.toList());
        System.out.println(listsort2);

    }
}
