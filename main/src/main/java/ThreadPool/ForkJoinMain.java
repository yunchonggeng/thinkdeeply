package ThreadPool;

import java.util.concurrent.ForkJoinPool;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-12-04 20:15
 **/
public class ForkJoinMain {
    public static void main(String[] args) {
        try {
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            Integer sum = forkJoinPool.invoke(new ForkJoinTest(0, 1000));
            System.out.println("计算出来的总和=" + sum);
            forkJoinPool.shutdown();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }
}
