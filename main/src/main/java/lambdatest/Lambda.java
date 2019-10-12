package lambdatest;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-09-19 14:24
 **/

@FunctionalInterface
interface Print<T> {
    public void print(T x);
}

public class Lambda {
    public static void PrintString(String s,Print<String> print){
        print.print(s);
    }

    public static void main(String[] args) {
        int i=0;
        PrintString("test",(x)->{
            System.out.println(x+i);
        });
    }
}
