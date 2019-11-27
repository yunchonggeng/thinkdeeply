package lambdatest.stream.features;

import lambdatest.stream.CreateData;
import lambdatest.stream.Dish;

import java.util.List;

/**
 * @program: main
 * @description: 过滤器
 * @author: william
 * @create: 2019-10-05 17:01
 **/
public class StreamFilter {
    public static void main(String[] args) {
        List<Dish> menu= CreateData.createMenu();
        long count=menu.stream().filter(i->i.getCalories()>100).count();
        System.out.println(count);
    }
}
