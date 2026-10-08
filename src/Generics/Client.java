package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Item i1 = new Item("1", "bat", 10, 1000);
        Item i2 = new Item("2", "Bowl", 20, 200);
        Item i3 = new Item("3", "Shirt", 15, 800);
        Item i4 = new Item("4", "Jeans", 12, 600);

        List<Item> items = new ArrayList<>();

        Inventory<Book> bookInventory = new Inventory<>();

        items.add(i1);
        items.add(i3);
        items.add(i2);
        items.add(i4);

        Collections.sort(items);

        System.out.println(items);
    }
}
