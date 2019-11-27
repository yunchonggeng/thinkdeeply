package tmp;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-11-22 19:55
 **/
public class MapMain {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("name","123");
        Integer hash=map.hashCode();
        System.out.println(hash);


        Map<String,String> map2=new HashMap<>();
        map2.put("name","123");
        int hash2=map2.hashCode();

        boolean bl=map.equals(map2);
        System.out.println(bl);
    }
}
