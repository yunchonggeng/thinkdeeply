package lambdatest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {


    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("ricky", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
//
//        Person result1 = persons.stream()                        // Convert to steam
//                .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
//                .findAny()                                      // If 'findAny' then return found
//                .orElse(null);                                  // If not found, return null
//
//        System.out.println(result1.toString());
//
//        Person result2 = persons.stream()
//                .filter(x -> "ahmook".equals(x.getName()))
//                .findAny()
//                .orElse( new Person("ahmook", 30));
//
//        System.out.println(result2.toString());

       persons = Arrays.asList(
                new Person("ricky", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        String name = persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Person::getName)                        //convert stream to String
                .findAny()
                .orElse("");

        System.out.println("name : " + name);

        List<Integer> collect = persons.stream()
                .map(Person::getAge)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
