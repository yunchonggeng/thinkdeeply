package java8.core1;


import java.util.StringJoiner;

public class Apple{
    private String color;
    private int weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Apple.class.getSimpleName() + "[", "]")
                .add("color='" + color + "'")
                .add("weight=" + weight)
                .toString();
    }
}