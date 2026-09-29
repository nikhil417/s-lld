package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
//        System.out.println(Runtime.getRuntime().availableProcessors());
//
//        PrintTask task = new PrintTask("Task 1");
//
//        System.out.println("Calling run");
//        task.run();
//
//        System.out.println("Calling start");
//        Thread thread = new Thread(task, "Worker-A");
//        thread.start();
//        System.out.println("Main finished");
// / ///////////////////////

//        NumberTask task1 = new NumberTask("Task 1");
//        NumberTask task2 = new NumberTask("Task 2");
//
//        Thread t1 = new Thread(task1, "Worker-1");
//        Thread t2 = new Thread(task2, "Worker-2");
//
//        t1.start();
//        t2.start();
//
//        System.out.println("Main is waiting");
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Both worker finished");
//
//        /// /////////////

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//
//        for (int i = 0; i <= 6; i++) {
//            PoolTask task = new PoolTask(i);
//            executor.execute(task);
//        }
//
//        executor.shutdown();
//
//        /// ///////////////////////

//        ExecutorService executor = Executors.newFixedThreadPool(1);
//
//        SumTask task = new SumTask();
//
//        System.out.println("Before submit");
//
//        Future<Integer> future = executor.submit(task);
//
//        System.out.println("After submit");
//
//        System.out.println("Before get");
//
//        Integer result = future.get();
//
//        System.out.println("After get");
//        System.out.println("Result = " + result);
//
//        executor.shutdown();
//
//        /// /////////////

        Counter counter = new Counter();

        Thread adderThread = new Thread(new Adder(counter), "Adder");

        Thread subtracterThread = new Thread(new Subtractor(counter), "Subtractor");

        adderThread.start();
        subtracterThread.start();

        adderThread.join();
        subtracterThread.join();

        System.out.println("Final value = " + counter.value);
    }
}
