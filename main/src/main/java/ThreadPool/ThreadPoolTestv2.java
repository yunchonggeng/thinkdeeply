package ThreadPool;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.MapMaker;
import com.google.common.graph.Graph;
import lombok.Value;


import java.security.Key;
import java.util.concurrent.*;

public class ThreadPoolTestv2 {
    public static void main(String[] args) {
        //线程池的基本大小
        int corePoolSize=4;
        //最大的线程数
        int maximumPoolSize=4;
        //线程活动保持时间
        long keepAliveTime=0L;
        //线程活动保持时间单位
        TimeUnit unit=TimeUnit.MILLISECONDS;
        BlockingQueue<Runnable> workQueue=new LinkedBlockingDeque<Runnable>();
        //RejectedExecutionHandler handler =new RejectedExecutionHandler();
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(corePoolSize,maximumPoolSize,keepAliveTime,unit,workQueue);

        for(int i=0;i<100;i++) {
            int finalI = i;
            threadPool.execute(()-> {
                try {
                    test(finalI);
                    System.out.println("线程数"+threadPool.getPoolSize());
                    System.out.println("线程依据完成的数量"+threadPool.getCompletedTaskCount());
                    System.out.println("线程池活动的数量"+threadPool.getActiveCount());
                    System.out.println("线程数"+threadPool.getActiveCount());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        threadPool.shutdown();
    }

    private static void test(int i) throws InterruptedException {
        System.out.println(i+"调用任务开始");
        TimeUnit.MILLISECONDS.sleep(1000L);
    }



}
