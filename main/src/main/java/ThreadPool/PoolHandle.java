package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;




public class PoolHandle {

    final int DEFAULT_THREAD_POOL_SIZE=10;
    public int getPoolSize() {

        try {
            int poolSize = 10;
            int availPros = Runtime.getRuntime().availableProcessors();
            // 防止mcc配置出错, 由于结算服务是IO密集型的, 最大线程不超 2 * CPU
            return Math.min(poolSize, availPros * 2);

        } catch (Exception e) {
            //log.error("mcc配置的资金归集线程池解析异常, 使用默认大小 size={}", DEFAULT_THREAD_POOL_SIZE);
        }

        return DEFAULT_THREAD_POOL_SIZE;
    }

    /**
     * 关闭线程池
     *
     * @param pool 线程池
     */
    public void closePool(ExecutorService pool) {
        try {
            pool.shutdown(); // 由于使用了future.get()；理论上在此处所有任务已经跑完
            if (!pool.awaitTermination(10, TimeUnit.MINUTES)) { // 默认最长等待10分钟
                //log.error("资金归集等待线程池关闭超时, 将强行关闭....");
                pool.shutdownNow();
            }
        } catch (Exception e) {
            //log.error("资金归集线程池关闭异常", e);
        }
    }


}
