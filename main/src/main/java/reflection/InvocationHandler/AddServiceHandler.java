package reflection.InvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-10-22 00:24
 **/
public class AddServiceHandler implements InvocationHandler {
    private AddService addService;

    /** 构造方法 **/
    public AddServiceHandler(AddService addService) {
        this.addService = addService;
    }

    /** 获取代理 **/
    public AddService getProxy() {
        return (AddService) Proxy.newProxyInstance(addService.getClass().getClassLoader(),
                addService.getClass().getInterfaces(), this);
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before111");
        Object invoke = method.invoke(addService, args);
        System.out.println("after");
        return invoke;
    }
}
