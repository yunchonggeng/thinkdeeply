package reconsitution.Packaging;

import java8.core1.Apple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: main
 * @description: 1. 容易犯的一个错误就是只对集合变量的访问进行了封装，
 * 但依然让提取函数返回集合本身，
 * 这使得集合的成员变量可以直接被修改，
 * 而封装它的类则全然不知，无法介入。
 * @author: william
 * @create: 2019-08-29 11:24
 **/
public class Temp {
    public static void main(String[] args) {
        List<Apple> appleList= new ArrayList<Apple>();
        Apple apple=new Apple();
        apple.setColor("红色");
        appleList.add(apple);
        Apple apple1=new Apple();
        apple1.setColor("绿色");
        appleList.add(apple1);
        for(Apple apple2:appleList){
            if(apple2.getColor().equals("红色")){
                apple2.setColor("黄色");
            }
        }
        System.out.println(appleList);
        Apple apple3=appleList.get(0);
        apple3.setColor("紫色");
        System.out.println(appleList);

        Map<String,Apple> appleMap=new HashMap<>();
        appleMap.put("160",apple1);

        Apple a=appleMap.get("160");
        a.setColor("红色");
        System.out.println(appleMap);
    }
}
