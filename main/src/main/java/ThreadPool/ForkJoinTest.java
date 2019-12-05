package ThreadPool;

import java.util.concurrent.RecursiveTask;


/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-12-04 19:37
 **/
public class ForkJoinTest extends RecursiveTask<Integer> {
    private static final int THRESHOLD=70;
    private int beginNum;
    private int endNum;

    public ForkJoinTest(Integer beginNum,Integer endNum){
        this.beginNum=beginNum;
        this.endNum=endNum;
    }

    @Override
    protected Integer compute() {
        int sum=0;
        if((endNum-beginNum)<THRESHOLD){
            for(int i=beginNum;i<endNum;i++){
                sum+=i;
            }
        }else{
            int tmp=(endNum+beginNum)/2;
            ForkJoinTest left=new ForkJoinTest(beginNum,tmp);
            ForkJoinTest right=new ForkJoinTest(tmp,endNum);
            left.fork();
            right.fork();
            sum=left.join()+right.join();
        }
        return sum;
    }


}
