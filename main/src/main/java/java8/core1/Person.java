package java8.core1;

/**
 * @program: main
 * @description: 人类
 * @author: william
 * @create: 2019-08-29 11:29
 **/
public class Person {
    private String name;
    private Byte sex;
    private Apple apple;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
}
