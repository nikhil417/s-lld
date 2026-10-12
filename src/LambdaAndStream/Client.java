package LambdaAndStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

//        Runnable task = () -> {
//            System.out.println("Hello World");
//        };
//
//        Thread t1 = new Thread(task);
//        t1.start();
//
//
//        List<Integer> l1 = Arrays.asList(2,4,-3,-5,1);

//        Collections.sort(l1, (x,y) -> {
//            return x*x - y*y;
//        });

//        Collections.sort(l1, (x,y) -> x*x - y*y);
//
//        System.out.println(l1);
//
//        Calculator adder = (a,b,c) -> a+b+c;
//
//        System.out.println(adder.calculate(1,2,3));


        List<Integer> l = Arrays.asList(2,3,8,3,5,2,4);

//        l.stream()
//                .filter(x -> x % 2 == 0)
//                .map(x -> x*x)
//                .distinct()
//                .sorted((a, b) -> Integer.compare(b,a))
//                .forEach(x -> System.out.println(x));

        Stream s = l.stream()
                .map(x -> {
                    System.out.println("Mapping " + x);
                    return x*x;
                });

        System.out.println("Done");

        s.forEach(x -> System.out.println(x));
    }
}
