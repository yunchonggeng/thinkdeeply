package reflection.InvocationHandler;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-10-22 17:36
 **/
public class SelfHand {
    public static void main(String[] args) throws Exception {
        AddServiceImpl addServiceImpl=new AddServiceImpl();
        AddServiceHandler addServiceHandler=new AddServiceHandler(addServiceImpl);
        AddService addService= addServiceHandler.getProxy();
        System.out.println(addService.add(1,2));
        print();
    }

    private static void print(){
        byte[] classFile= ProxyGenerator.generateProxyClass("$Proxy1",AddServiceImpl.class.getInterfaces());
        String path="/Users/gengyunchong/thinkdeeply/main/target/classes/reflection/AddServiceProxy.class";
        try(FileOutputStream fileOutputStream=new FileOutputStream(path)){
            fileOutputStream.write(classFile);
            fileOutputStream.flush();
            System.out.println("代理类Class文件写入成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
