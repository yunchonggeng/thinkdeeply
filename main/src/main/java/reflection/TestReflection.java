package reflection;

import lambdatest.Person;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.*;

/**
 * @program: main
 * @description: 测试反射  https://juejin.im/post/598ea9116fb9a03c335a99a4
 * @author: william
 * @create: 2019-08-01 19:36
 **/
public class TestReflection  {
    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        printFields();
        printMethods();
    }
    /**
    * @Description:通过反射获取类的所有变量
    * @Param:
    * @return:
    * @Author: william
    * @Date: 2019/8/1
    */
    private static void printFields(){
        //1.获取并输出类的名称
        Class mclass=SonClass.class;
        System.out.println(mclass.getName());
        //2.1获取所有public 访问权限的变量
        // 包括本类声明的和从父类继承的
        //Field[] fields=mclass.getFields();
        //2.2 获取所有本类声明的变量（不问访问权限）
        Field[] fields = mclass.getDeclaredFields();
        //3.遍历变量并输出变量信息
        for(Field field:fields){
            //获取访问权限并输出
            int modifiers=field.getModifiers();
            System.out.println(Modifier.toString(modifiers)+" ");
            //输出变量的类型及变量名
            System.out.println(field.getType().getName()+" "+field.getName());
        }
    }

    /** 
    * @Description: 通过反射获取类的所有方法
    * @Param:  
    * @return:  
    * @Author: william
    * @Date: 2019/8/1 
    */
    private static void printMethods() {
        //1.获取并输出类的名称
        Class mclass = SonClass.class;
        System.out.println("类的名称"+mclass.getName());

        //2.1获取所有public访问权限的方法
        //包括自己声明和从父类继承的
        Method[] mMethods = mclass.getMethods();

        //2.2 获取所有本类的的方法（不问访问权限）
        //Method[] mMethods = mclass.getDeclaredMethods();

        //3.遍历所有方法
        for(Method method:mMethods){
            //获取并输出方法的访问权限（Modifiers: 修饰符）
            int modifiers=method.getModifiers();
            String name=method.getName();
            System.out.print(Modifier.toString(modifiers) +" ");
            //获取并输出方法的返回值类型
            Class returnType=method.getReturnType();
            System.out.print(returnType.getName() + " "
                    + method.getName() + "( ");
            //获取并输出方法的所有参数
            Parameter[] parameters=method.getParameters();
            for(Parameter parameter:parameters){
                System.out.print(parameter.getType().getName()+" "+parameter.getName()+",");
            }
            //获取并输出方法跑输出的异常
            Class[] exceptionTypes=method.getExceptionTypes();
            if(exceptionTypes.length==0){
                System.out.println(" )");
            }else{
                for(Class c:exceptionTypes){
                    System.out.println(" ) throws "+c.getName());
                }
            }

        }

        //获取并输出方法抛出的异常
        //Class[] exceptionTypes=


    }
}
