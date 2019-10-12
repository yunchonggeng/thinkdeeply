package ThreadPool;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExchangerTest {
    private static final Exchanger<String> exger=new Exchanger<String>();
    private static ExecutorService threadPool=Executors.newFixedThreadPool(2);

    public static void main(String[] args) {

    }
}
