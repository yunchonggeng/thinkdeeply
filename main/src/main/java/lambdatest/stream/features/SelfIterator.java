package lambdatest.stream.features;

import lambdatest.stream.CreateData;
import lambdatest.stream.Dish;

import java.util.Iterator;
import java.util.List;

/**
 * @program: main
 * @description: 迭代器又称为游标
 * @author: william
 * @create: 2019-10-23 20:51
 **/
public class SelfIterator {
    public static void main(String[] args) {
        List<Dish>  list=CreateData.createMenu();
        Iterator<Dish> iterator=list.iterator();
        while(iterator.hasNext()){
            Dish dish= iterator.next();
            System.out.println(dish.getName());
        }
    }
}
