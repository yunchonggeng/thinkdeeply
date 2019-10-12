package lambdatest.stream.features;

import lambdatest.stream.CreateData;
import lambdatest.stream.Dish;
import lambdatest.stream.collect.ToListCollector;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-10-02 02:08
 **/
public class StreamMap {
    public static void main(String[] args) {
        List<Dish> menu= CreateData.createMenu();
        List<String> threeHighCaloricDishNames =menu.stream()
                //.filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                //.limit(3)
                .collect(new ToListCollector<String>());
                //.collect(toList());
        System.out.println(threeHighCaloricDishNames);
    }
}
