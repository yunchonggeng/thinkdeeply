package gof.builder.builder1;

/**
 * @program: main
 * @description: 建造者
 * @author: william
 * @create: 2019-09-04 21:24
 **/
public class ConcreteBuilder extends Builder{
    private Product product;
    public ConcreteBuilder() {
        product = new Product();
    }
    @Override
    void bulidA(String a) {
        product.setBuildA(a);
    }
    @Override
    void bulidB() {
        product.setBuildB("钢筋工程");
    }
    @Override
    void bulidC() {
        product.setBuildC("铺电线");
    }
    @Override
    void bulidD() {
        product.setBuildD("粉刷");
    }
    @Override
    Product getProduct() {
        return product;
    }
}
