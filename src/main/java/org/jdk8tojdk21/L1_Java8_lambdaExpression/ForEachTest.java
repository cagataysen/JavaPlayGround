package org.jdk8tojdk21.L1_Java8_lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachTest {

    /*Using the method as reference*/
    public static void listing(String e){
        System.out.println(e);
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Alex", "Cagatay", "Marcin");
        list.forEach(System.out::println);
        //or
        list.forEach(e -> System.out.println(e));


        //method reference usage
        Consumer<String> consumer = ForEachTest::listing;
        consumer.accept("Hello world");

        List<String> names = Arrays.asList("Piotr", "Jolka", "Ola");
        names.forEach(ForEachTest::listing);




        Consumer<String> makeUpperCase = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        list.forEach(makeUpperCase);


        Map<String, String> map = Map.of("A", "Alex", "B", "Brian", "C", "Cagatay");;
        map.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v ));

        BiConsumer<String, Integer> action = (a, b) -> {
            System.out.println("Key is : " + a);
            System.out.println("Value is : " + b);
        };

        Map<String, Integer> anotherMap = Map.of("A", 1, "B", 2, "C", 3);
        anotherMap.forEach(action);



        List<Integer> numberList = List.of(1,22,63,31,5,17,4,10);
        Consumer<Integer> actionConsumer = System.out::println;

        numberList.stream().filter(i -> i%2 == 0).forEach(actionConsumer);


    }


}
