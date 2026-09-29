package Multithreading;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {

    public Integer call() throws Exception {

        System.out.println(
                "Calculation started on " +
                        Thread.currentThread().getName()
        );

        Thread.sleep(3000);

        System.out.println(
                "Calculation finished on " +
                        Thread.currentThread().getName()
        );

        return 10 + 20;
    }
}
