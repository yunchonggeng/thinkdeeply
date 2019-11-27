package lambdatest.stream.features;

import lambdatest.stream.CreateData;
import lambdatest.stream.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: main
 * @description: 排序
 * @author: william
 * @create: 2019-11-15 11:49
 **/
public class StreamSorted {
    public static void main(String[] args) {
        List<Dish> list= CreateData.createMenu();
        List<Dish> listDesc=list.stream().sorted((a,b)->b.getName().compareTo(a.getName())).collect(Collectors.toList());
        System.out.println(listDesc);

        List<Dish> listAsc=list.stream().sorted((a,b)->a.getName().compareTo(b.getName())).collect(Collectors.toList());
        System.out.println(listAsc);
    }
}
