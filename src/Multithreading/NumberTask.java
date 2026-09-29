package Multithreading;

public class NumberTask implements Runnable {

    private final String taskName;

    public NumberTask(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " -> " + i + " -> " + Thread.currentThread().getName() );
        }
    }
}
