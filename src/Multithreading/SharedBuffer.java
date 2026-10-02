package Multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class SharedBuffer {
    final Queue<Integer> queue = new LinkedList<>();

    final Semaphore emptySlots;
    final Semaphore filledSlots;
    final Semaphore mutex;

    public SharedBuffer(int capacity) {
        emptySlots = new Semaphore(capacity);
        filledSlots = new Semaphore(0);
        mutex = new Semaphore(1);
    }
}
