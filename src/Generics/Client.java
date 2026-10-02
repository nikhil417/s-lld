package Generics;

public class Client {

    public static void main(String[] args) {

//        Object type if nothing is passed/ raw type
//        Stack s = new Stack();

        Pair<String, Double> p1 = new Pair<>();

        p1.setX("Rob");
        p1.setY(123.2);

        System.out.println(p1.getX());
        System.out.println(p1.getY());


        Pair.doSomething(123);

    }
}
