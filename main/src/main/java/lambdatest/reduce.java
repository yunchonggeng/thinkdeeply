package lambdatest;

import java.util.Optional;
import java.util.stream.Stream;

public class reduce {
    public static void main(String[] args) {
        Optional accResult = Stream.of(1, 2, 3, 4)
                .reduce((acc, item) -> {
                    System.out.println("acc : "  + acc);
                    acc += item;
                    System.out.println("item: " + item);
                    System.out.println("acc+ : "  + acc);
                    System.out.println("--------");
                    return acc;
                });
        System.out.println("accResult: " + accResult.get());
        System.out.println("--------");

    }
}
