package reflection.InvocationHandler;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-10-22 00:23
 **/
public class AddServiceImpl implements AddService {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
