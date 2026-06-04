package Collections.QueueTut;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentLinkedQueueDemo {
    public static void main(String[] args) {
        /* ConcurrentLinkedQueue is a thread-safe, non-blocking Queue designed for high-performance concurrent applications.
        *
        * ConcurrentLinkedQueue -> An implementation of the Queue interface that supports lock-free, Thread-safe operations */
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3);

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put(i); // waits if queue is full
                    System.out.println("Produced: " + i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int item = queue.take(); // waits if queue is empty
                    System.out.println("Consumed: " + item);
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();

        /*
Producer:
    queue.put(item);   // blocks if full

Consumer:
    queue.take();      // blocks if empty

LinkedBlockingQueue:
    - Thread-safe
    - FIFO
    - Producer-Consumer pattern
    - No manual synchronization needed
*/
    }
}

