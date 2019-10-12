package gof.builder.builder2;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-09-04 21:35
 **/
public class Main {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Product build = concreteBuilder
                .bulidA("怎样")

                .bulidC("全家桶2")
                .bulidD("冰淇淋2")
                .build();
        System.out.println(build.toString());
    }
}
