package Multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreTask implements Runnable{

    private int taskId;
    private Semaphore semaphore;

    public SemaphoreTask(int taskId, Semaphore semaphore) {
        this.taskId = taskId;
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            System.out.println("Task " + taskId + " waiting");

            semaphore.acquire();

            System.out.println("Task " + taskId + " entered using " + Thread.currentThread().getName());

            Thread.sleep(3000);

            System.out.println(
                    "Task " + taskId + " leaving"
            );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }

    }
}
