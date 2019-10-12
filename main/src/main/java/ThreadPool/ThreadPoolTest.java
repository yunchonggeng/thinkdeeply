package ThreadPool;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("helloword");
            }
        });
        Map<String,Thread> map=new HashMap<String,Thread>(1);
        map.put("test",thread);
        map.get("test").start();

    }


}
