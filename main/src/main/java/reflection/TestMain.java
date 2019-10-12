package reflection;

/**
 * @program: main
 * @description: 静态反射
 * @author: william
 * @create: 2019-08-01 19:17
 **/
public class TestMain {
    public static void main(String[] args) {
        System.out.println(XYZ.name);
    }
}

class XYZ {
    public static String name = "william";

    static {
        System.out.println("每个类都会产生一个对应的Class对象，也就是保存在.class文件。");
        System.out.println("所有类都是在对其第一次使用时，动态加载到JVM的，当程序创建一个对类的静态成员的引用时，就会加载这个类。" );
        System.out.println("Class对象仅在需要的时候才会加载，static初始化是在类加载时进行的。");
    }

    public XYZ() {
        System.out.println("william构造了");
    }
}

