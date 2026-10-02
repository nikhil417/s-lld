package Multithreading;

public class Producer implements Runnable{
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            try {
                buffer.emptySlots.acquire();

                buffer.mutex.acquire();

                try {
                    buffer.queue.add(i);

                    System.out.println(
                            "Produced " + i +
                                    " | Queue: " + buffer.queue
                    );
                } finally {
                    buffer.mutex.release();
                }

                buffer.filledSlots.release();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
