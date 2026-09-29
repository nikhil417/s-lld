package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int value = 0;

//    final Lock lock = new ReentrantLock();

    public synchronized void increment() {
        value++;
    }

    public synchronized void decrement() {
        value--;
    }
}
