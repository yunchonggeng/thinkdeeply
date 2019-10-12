package gof.builder.builder2;

/**
 * @program: main
 * @description: 建设者
 * @author: william
 * @create: 2019-09-04 21:32
 **/
abstract class Builder {
    //汉堡
    abstract Builder bulidA(String mes);
    //饮料
    abstract Builder bulidB(String mes);
    //薯条
    abstract Builder bulidC(String mes);
    //甜品
    abstract Builder bulidD(String mes);
    //获取套餐
    abstract Product build();
}
