package lambdatest.stream;

import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @program: main
 * @description: 并行流
 * @author: william
 * @create: 2019-11-27 00:16
 **/
public class ParallelStreams {
    public static void main(String[] args) {
        System.out.println("Sequential sum done in :"+measureSumPerf(ParallelStreams::sequentialSum,10_000_000)+" msecs");
        System.out.println("Iterative sum done in :"+measureSumPerf(ParallelStreams::inerativeSum,10_000_000)+" msecs");
        System.out.println("paralle sum done in :"+measureSumPerf(ParallelStreams::paralleSum,10_000_000)+" msecs");
        System.out.println("rangeS sum done in :"+measureSumPerf(ParallelStreams::rangeSum,10_000_000)+" msecs");
        System.out.println("paralleRanged sum done in :"+measureSumPerf(ParallelStreams::paralleRangedSum,10_000_000)+" msecs");
        System.out.println("SideEffect parallel sum done in: " + measureSumPerf(ParallelStreams::sideEffectParallelSum, 10_000_000L) +" msecs" );
    }

    public static long sequentialSum(long n){
        return Stream.iterate(1L,i->i+1).limit(n).reduce(0L,Long::sum);
    }

    public static long inerativeSum(long n){
        long result=0;
        for(long i=1L;i<=n;i++){
            result+=i;
        }
        return result;
    }

    public static long paralleSum(long n){
        return Stream.iterate(1L,i->i+1).limit(n).parallel().reduce(0L,Long::sum);
    }

    public static long rangeSum(long n){
        return LongStream.rangeClosed(1,n).reduce(0L,Long::sum);
    }

    public static long paralleRangedSum(long n){
        return LongStream.rangeClosed(1,n).parallel().reduce(0L,Long::sum);
    }

    /**
     * forEach中调用的方法有副作用， 它会改变多个线程共享对象的可变状态。要是你想用并行Stream又不想引发类似的意外，就必须避免这种情况
     * @param n
     * @return
     */
    public static long sideEffectParallelSum(long n){
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        return accumulator.total;
    }

    public static class Accumulator {
        public long total = 0;
        public void add(long value) { total += value; }
    }

    /**
     * 这个方法接受一个函数和一个long作为参数。它会对传给的方法的long应用函数10次,记录每次执行的时间（以毫秒为单位），并返回最短的一次执行时间。
     * 假设你把先前开发的所有方法都放进一个名为parallelstreams的类，你就可以用这个框架来测试顺序加法器函数对前一千万个自然数求和要用多久
     * @param adder
     * @param n
     * @return
     */
    public static long measureSumPerf(Function<Long,Long> adder,long n){
        long fastest=Long.MAX_VALUE;
        for(int i=0;i<10;i++){
            long start=System.nanoTime();
            long sum=adder.apply(n);
            long duration =(System.nanoTime()-start)/1_000_000;
            System.out.println("Resutl:"+sum);
            if(duration<fastest){
                fastest=duration;
            };
        }
        return fastest;
    }
}
