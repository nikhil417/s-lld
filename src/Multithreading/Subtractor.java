package Multithreading;

public class Subtractor implements Runnable {

    private final Counter counter;

    public Subtractor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {

//            synchronized (counter) {
//                counter.value--;
//            }

            counter.decrement();
        }
    }
}
