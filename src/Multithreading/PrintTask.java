package Multithreading;

public class PrintTask implements Runnable  {

    private final String lastName;

    public PrintTask(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void run() {
        System.out.println(lastName + " executed by " + Thread.currentThread().getName());
    }
}
