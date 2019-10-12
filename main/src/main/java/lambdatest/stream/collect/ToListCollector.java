package lambdatest.stream.collect;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-10-10 21:52
 **/
public class ToListCollector<T> implements Collector<T, List<T>,List<T>> {

    /**
     * 创造集合操作的起始点 创建一个空的容器
     * @return
     */
    @Override
    public Supplier<List<T>> supplier() {
        return ArrayList::new;
    }

    /**
     * 累计遍历过的项目，原位修改累加器
     * @return
     */
    @Override
    public BiConsumer<List<T>, T> accumulator() {
        return List::add;
    }

    /**
     * 修改第一个累加器，将其与第二个累加器的内容合并
     * @return
     */
    @Override
    public BinaryOperator<List<T>> combiner() {
        return (list1,list2)->{
            list1.addAll(list2);
            return list1;
        };
    }

    /**
     * 恒等函数
     * @return
     */
    @Override
    public Function<List<T>, List<T>> finisher() {
        return Function.identity();
    }

    /**
     * 为收集器添加IDENTITY——FINISH和CONCURRENT标志
     * @return
     */
    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH,Characteristics.CONCURRENT));
    }
}
