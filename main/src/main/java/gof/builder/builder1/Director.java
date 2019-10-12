package gof.builder.builder1;

/**
 * @program: main
 * @description: 指挥者
 * @author: william
 * @create: 2019-09-04 21:25
 **/
public class Director {
    //指挥工人按顺序造房
    public Product create(Builder builder,String a) {
        builder.bulidA(a);
        builder.bulidB();
        builder.bulidC();
        builder.bulidD();
        return builder.getProduct();
    }
}
