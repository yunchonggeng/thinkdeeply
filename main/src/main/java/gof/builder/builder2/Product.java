package gof.builder.builder2;

import java.util.StringJoiner;

/**
 * @program: main
 * @description: 产品
 * @author: william
 * @create: 2019-09-04 21:34
 **/
public class Product {
    private String buildA;
    private String buildB;
    private String buildC;
    private String buildD;
    public String getBuildA() {
        return buildA;
    }
    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }
    public String getBuildB() {
        return buildB;
    }
    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }
    public String getBuildC() {
        return buildC;
    }
    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }
    public String getBuildD() {
        return buildD;
    }
    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("buildA='" + buildA + "'")
                .add("buildB='" + buildB + "'")
                .add("buildC='" + buildC + "'")
                .add("buildD='" + buildD + "'")
                .toString();
    }
}
