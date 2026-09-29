package Multithreading;

public class PoolTask implements Runnable{

    private final int taskId;

    public PoolTask(int taskId){
        this.taskId = taskId;
    }

    public void run() {
        System.out.println(
                "Task " + taskId +
                        " started on " +
                        Thread.currentThread().getName()
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(
                "Task " + taskId +
                        " finished on " +
                        Thread.currentThread().getName()
        );
    }
}
