package Generics;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.isExpress() == o2.isExpress()) {
            return 0;
        } else if (o2.isExpress()) {
                return 1;
        }
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
