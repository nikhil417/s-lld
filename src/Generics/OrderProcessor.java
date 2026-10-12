package Generics;

import java.util.PriorityQueue;

public class OrderProcessor {
    private PriorityQueue<Order> orders;

    public OrderProcessor() {
        orders = new PriorityQueue<>(new OrderComparator());
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order processOrder() {
        return orders.poll();
    }
}
