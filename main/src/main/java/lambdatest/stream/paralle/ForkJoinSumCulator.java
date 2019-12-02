package lambdatest.stream.paralle;

/**
 * @program: main
 * @description: blabla
 * @author: william
 * @create: 2019-11-28 00:39
 **/
public class ForkJoinSumCulator extends java.util.concurrent.RecursiveTask<Long>{
    private final long[] numbers;
    private final int start;
    private final int end;

    public static final long THRESHOLD=10_000;

    public ForkJoinSumCulator(long[] numbers){
        this(numbers,0,numbers.length);
    }

    private ForkJoinSumCulator(long[] numbers,int start,int end){
        this.numbers=numbers;
        this.start=start;
        this.end=end;
    }

    private long computeSequentially(){
        long sum=0;
        for(int i=start;i<end;i++){
            sum+=numbers[i];
        }
        return sum;
    }
    @Override
    protected Long compute() {
        int length=end-start;
        if(length<=THRESHOLD){
            return computeSequentially();
        }
        ForkJoinSumCulator leftTask=new ForkJoinSumCulator(numbers,start,start+length/2);
        leftTask.fork();
        ForkJoinSumCulator rightTask=new ForkJoinSumCulator(numbers,start+length/2,end);
        Long rightResult=rightTask.compute();
        Long leftResult=leftTask.join();
        return leftResult+rightResult;
    }
}
