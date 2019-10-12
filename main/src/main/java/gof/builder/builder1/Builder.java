package gof.builder.builder1;

/**
 * @program: main
 * @description: 建造者
 * @author: william
 * @create: 2019-09-04 21:22
 **/
abstract class Builder {
    //地基
    abstract void bulidA(String a);
    //钢筋工程
    abstract void bulidB();
    //铺电线
    abstract void bulidC();
    //粉刷
    abstract void bulidD();
    //完工-获取产品
    abstract Product getProduct();
}
