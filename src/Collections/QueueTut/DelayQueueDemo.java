package Collections.QueueTut;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        /* DelayQueue is a special thread-safe BlockingQueue where elements can only be taken out after a specified delay has expired
        *  A Delay Queue can only store objects that implement Delayed interface */

        BlockingQueue<Delayedtask> delayedQueue = new DelayQueue<>();
        delayedQueue.offer(new Delayedtask("Task 1", 5, TimeUnit.SECONDS));
        delayedQueue.offer(new Delayedtask("Task 2", 3, TimeUnit.SECONDS));
        delayedQueue.offer(new Delayedtask("Task 3", 10, TimeUnit.SECONDS));

        while(!delayedQueue.isEmpty())
        {
            Delayedtask task = delayedQueue.take(); //Blocks until a task's delay has expired
            System.out.println("Executed: " + task.getTaskName() + " at " + System.currentTimeMillis());
        }

    }
}

class Delayedtask implements Delayed{
    private final String taskName;
    private final long startTime;

    public Delayedtask(String taskName, long delay, TimeUnit unit)
    {

        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if(this.startTime < ((Delayedtask) o).startTime)
        {
            return -1;
        }
        if(this.startTime > ((Delayedtask) o).startTime){
            return 1;
        }
        return 0;
    }

    public String getTaskName(){
        return taskName;
    }
}
