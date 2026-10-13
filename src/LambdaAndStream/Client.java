package LambdaAndStream;

import java.util.*;
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
//
//
//        List<Integer> l = Arrays.asList(2,3,8,3,5,2,4);

//        l.stream()
//                .filter(x -> x % 2 == 0)
//                .map(x -> x*x)
//                .distinct()
//                .sorted((a, b) -> Integer.compare(b,a))
//                .forEach(x -> System.out.println(x));

//        Stream s = l.stream()
//                .map(x -> {
//                    System.out.println("Mapping " + x);
//                    return x*x;
//                });
//
//        System.out.println("Done");
//
//        s.forEach(x -> System.out.println(x));


        List<Item> items = new ArrayList<>();
        items.add(new Electronics("E1", "Laptop", 55000, 5, 24));
        items.add(new Electronics("E2", "Mobile Phone", 22000, 8, 12));
        items.add(new Electronics("E3", "Earphones", 1500, 10, 6));
        items.add(new Book("B1", "Java", 799, 10, "James Gosling"));
        items.add(new Clothing("C1", "T-Shirt", 499, 20, "M"));

        // Print all item id
//        items.stream()
//                .map( x -> x.getId())
//                .forEach(x -> System.out.println(x));

        // print item names in lower case
//        items.stream()
//                .forEach(x -> System.out.println(x.getName().toLowerCase()));

        // print names whose price is greater than 1000
//        items.stream()
//                .filter(x -> x.getPrice() > 1000)
//                .forEach(x -> System.out.println(x.getName()));

        // check if any item is out of stock
//        boolean ans = items.stream()
//                .anyMatch(x -> x.getQuantity() <= 0);
//        System.out.println(ans);

        // Confirm no item has a negative quantity
//        boolean ans = items.stream()
//                .noneMatch( x -> x.getQuantity() <0);
//        System.out.println(ans);

        // In a single stream pipeline: filter items
        // priced above 1000 and
        // in stock,
        // get just their names,
        // remove duplicates,
        // sort alphabetically,
        // keep only the top 5.
//        List<String> ans = items.stream()
//                .filter( x -> x.getPrice() >= 1000 && x.getQuantity() > 0)
//                .map(x -> x.getName())
//                .distinct()
//                .sorted((a,b) -> a.compareToIgnoreCase(b))
//                .limit(5)
//                .toList();
//
//        System.out.println(ans);

        // get total quantity
//        int ans = items.stream()
//                .map(x -> x.getQuantity())
//                .reduce(0, (totalQuantity, quantity) -> totalQuantity + quantity);
//
//        System.out.println(ans);

        // get most expensive item
        Optional<Item> expensiveItem = items.stream().reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1:item2);
        System.out.println(expensiveItem.get());
    }
}
