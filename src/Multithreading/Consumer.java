package Multithreading;

public class Consumer implements Runnable{
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            try {
                buffer.filledSlots.acquire();

                buffer.mutex.acquire();

                try {
                    int value = buffer.queue.remove();

                    System.out.println(
                            "Consumed " + value +
                                    " | Queue: " + buffer.queue
                    );
                } finally {
                    buffer.mutex.release();
                }

                buffer.emptySlots.release();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
