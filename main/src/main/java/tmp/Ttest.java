package tmp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @program: main
 * @description: 泛型和通配符测试
 * @author: william
 * @create: 2019-10-13 19:12
 **/
public class Ttest{
    public static <T> T writeAll(Collection<T> coll, Sink<? super T> snk){
        T last = null;
        for(T t:coll){
            last =t;
            snk.flush(t);
        }
        return last;
    }

    public static void main(String[] args) {
//        Collection<String> cs=null;
//        Sink<Object> s=null;
//        String str=writeAll(cs,s);
//        System.out.println(str);
//        aa(new ArrayList<Integer>());
//
//        List<? extends T> foo3 = new ArrayList<T>();
//        foo3.(5);
//        List<? extends Number> foo31 = new ArrayList<Integer>();
//        foo3.add(5);
//        List<? extends Number> foo32 = new ArrayList<Double>();
//        foo3.add(5D);
//
//        List<? super Integer> foo33 = new ArrayList<Integer>();
//        List<? super Integer> foo34 = new ArrayList<Number>();
//        List<? super Integer> foo35 = new ArrayList<Object>();
//
//
//        System.out.println(foo3.get(0));

    }

}
