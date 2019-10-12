package gof.agent;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-09-02 20:07
 **/
public class Business implements IBuseriness2,IBusiness {
    @Override
    public void doSomeThing2() {
        System.out.println("执行业务逻辑");
    }

    @Override
    public void doSomeThing() {
        System.out.println("执行业务逻辑2");
    }
}
