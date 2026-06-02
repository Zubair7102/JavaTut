package Collections.QueueTut;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue)
    {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true)
        {
            try {
                System.out.println("Producer produced: " + value);
                queue.offer(value++);
                Thread.sleep(600);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue)
    {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true)
        {
            try {
                Integer value = queue.take();
                System.out.println("Consumer Consumed: " + value);
                Thread.sleep(900);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }
}


public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
 /* 1. Thread Safe Queue
 *  2. Wait for Queue to become non-empty / wait for space
 *  3. Simplify concurrency problems like producer-consumer
 *  4. Standard queue --> immediately and in standard queue -> if queue is empty --> remove (No waiting ), if queue is full --> add (no Waiting)
 *
 *
 * Blocking Queue
 *  1. put --> Blocks if the queue is full until space becomes available
 *  2. Blocks if the queue is empty until an element becomes available
 *  3. offer --> Waits for space to become available, up to specific timeout
 * BlockingQueue is a thread-safe queue that automatically blocks producers when the queue is full and blocks consumers when the queue is empty, making it ideal for producer-consumer applications.
 *
 * ArrayBlockingQueue is a thread-safe, bounded implementation of BlockingQueue that uses an array internally.
 * */

        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(6); // here BlockingQueue is an interface class and ArrayBlockingQueue is implementation class
        /* ArrayBlockingQueue is a thread-safe, bounded implementation of BlockingQueue that uses an array internally. */

        // here bq is shared queue
        Thread producer = new Thread(new Producer(bq));
        Thread consumer = new Thread(new Consumer(bq));
        producer.start();
        consumer.start();


        BlockingQueue<Integer> bq2 = new LinkedBlockingQueue<>();
        /* LinkedBlockingQueue is a thread-safe implementation of BlockingQueue that uses a linked list internally.
        * Head
           ↓
         [10] → [20] → [30] → null */

        /*
LinkedBlockingQueue:
- Thread-safe BlockingQueue
- Uses Linked List internally
- FIFO ordering
- Capacity is optional
- put() blocks when full
- take() blocks when empty
- Uses separate putLock and takeLock
- Often used in Producer-Consumer systems
*/

        BlockingQueue<Integer> bq3 = new PriorityBlockingQueue<>();
        /* PriorityBlockingQueue is a thread-safe version of PriorityQueue that implements BlockingQueue. */

        /*
PriorityBlockingQueue:
- Thread-safe BlockingQueue
- Uses Binary Heap internally
- Orders elements by priority
- take() blocks when queue is empty
- Usually unbounded
- Not FIFO
- Thread-safe version of PriorityQueue
*/

        bq3.offer(23);
        bq3.offer(12);
        bq3.offer(65);
        System.out.println(bq3);
        while(!bq3.isEmpty())
        {
            System.out.println(bq3.take());
        }


    }
}
