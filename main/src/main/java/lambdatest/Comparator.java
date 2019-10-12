package lambdatest;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: main
 * @description: 比对函数
 * @author: william
 * @create: 2019-08-21 21:52
 **/
public class Comparator {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2=list.stream().map(n->n*n).collect(Collectors.toList());
        Gson gson = new Gson();
        System.out.println(gson.toJson(list2));
    }
}
