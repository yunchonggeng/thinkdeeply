package gof.agent;

import java.lang.reflect.Proxy;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-09-02 20:01
 **/
public class Main {
    public static void main(String[] args) {
        Class[] proxyInterface =new Class[]{IBusiness.class,IBuseriness2.class};
        LogInvocationHandler handler=new LogInvocationHandler(new Business());
        ClassLoader classLoader=Business.class.getClassLoader();
        IBusiness proxyBusiness;
        proxyBusiness = (IBusiness) Proxy.newProxyInstance(classLoader,proxyInterface,handler);
        proxyBusiness.doSomeThing();
        ((IBusiness)proxyBusiness).doSomeThing();
    }
}
