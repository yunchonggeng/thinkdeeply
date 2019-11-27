package lambdatest.stream.features;


import lambdatest.stream.CreateData;
import lambdatest.stream.Dish;
import lambdatest.stream.collect.ToListCollector;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toList;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-10-02 02:08
 **/
public class StreamMap {
    public static void main(String[] args) {
//        Comparator<Dish> dishCaloriesComparator=Comparator.comparingInt(Dish::getCalories);
//        List<Dish> menu= CreateData.createMenu();
//        menu.stream().collect(maxBy(dishCaloriesComparator));
//
//        Collection
        transferElement(CreateData.createMenu());

    }

    private static void transferElement( List<Dish> menu) {
        String aa=menu.stream().map(Dish::getName).reduce((a,b)-> a+","+b).get();
                //.filter(d -> d.getCalories() > 300)

                //.limit(3)

        //.collect(toList());
        System.out.println(aa);
    }
}
