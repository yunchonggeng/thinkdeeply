package lambdatest;

public class LambdaTest {
    public static void main(String[] args) {
        Runnable r=()->{
            System.out.println("测试");
        };
        r.run();
    }



}
