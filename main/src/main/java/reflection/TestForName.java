package reflection;

/**
 * @program: main
 * @description: forName
 * @author: william
 * @create: 2019-08-01 19:30
 **/
public class TestForName {
    public static class Base {
        static int num = 1;

        static {
            System.out.println("Base " + num);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 不会初始化静态块
        Class clazz1 = Base.class;
        System.out.println("------");
        // 会初始化
        Class clazz2 = Class.forName("Base");
    }
}
