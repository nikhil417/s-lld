package Multithreading;

public class Adder implements Runnable{

    private final Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {

//            synchronized (counter) {
//                counter.value++ ;
//            }

            counter.increment();
        }
    }
}
