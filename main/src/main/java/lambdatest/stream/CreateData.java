package lambdatest.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @program: main
 * @description: 创建数据类
 * @author: william
 * @create: 2019-10-05 17:03
 **/
public class CreateData {
    /**
     * 创建菜单 dish（胆识）一道菜
     * @return
     */
    public static List<Dish> createMenu(){
        List<Dish> menu = Arrays.asList(
                //猪肉（扑克）vegetarian 素食 卡路里
                new Dish("pork", false, 800, Dish.Type.MEAT),
                //beef (庇护)
                new Dish("beef", false, 700, Dish.Type.MEAT),
                //
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                //炸薯条
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                //大虾（胖子）
                new Dish("prawns", false, 300, Dish.Type.FISH),
                //大马哈鱼(赛门)
                new Dish("salmon", false, 450, Dish.Type.FISH) );
        return menu;
    }
}
