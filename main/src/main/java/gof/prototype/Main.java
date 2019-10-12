package gof.prototype;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-09-04 22:24
 **/
public class Main {
    public static void main(String[] args){
        ConcretePrototype cp = new ConcretePrototype();
        for(int i=0; i< 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }
}
