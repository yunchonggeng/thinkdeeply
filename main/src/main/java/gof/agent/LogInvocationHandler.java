package gof.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: main
 * @description: 打印日志的切面
 * @author: william
 * @create: 2019-09-02 19:56
 **/
public class LogInvocationHandler  implements InvocationHandler {

    /**
     * 目标对象
     */
    private Object target;


    public LogInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行织入的日志，你可以控制哪些方法执行切入逻辑
        if(method.getName().equals("doSomeThing")){
            System.out.println("记录日志");
        }

        //执行原因逻辑
        Object recv=method.invoke(target,args);
        return recv;

    }
}
