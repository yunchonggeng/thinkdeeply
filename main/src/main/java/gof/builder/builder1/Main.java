package gof.builder.builder1;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-09-04 21:25
 **/
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Product create = director.create(new ConcreteBuilder(),"怎样");
        System.out.println(create.toString());
    }
}
