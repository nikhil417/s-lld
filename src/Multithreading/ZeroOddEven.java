package Multithreading;

import java.util.concurrent.Semaphore;

public class ZeroOddEven implements Runnable{

    private Semaphore zeroSemaphore;

    public ZeroOddEven(Semaphore zeroSemaphore) {
        this.zeroSemaphore = zeroSemaphore;
    }

    public void run() {
        try {
            try {
                zeroSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("");
        } catch (Exception e){

        }
    }
}
