package Multithreading;

import java.util.concurrent.Semaphore;

public class ZeroOddEven implements Runnable{

    private Semaphore zeroSemaphore;

    public ZeroOddEven(Semaphore zeroSemaphore) {
        this.zeroSemaphore = zeroSemaphore;
    }

    public void run() {
        try {
            zeroSemaphore.acquire();
            System.out.println("");
        }
    }
}
