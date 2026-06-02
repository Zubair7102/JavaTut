package Collections.QueueTut;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* FIFO --> First in First Out
* Enqueue --> Add at tail
* Dequeue --> Remove from head
* Peek --> gets you the first element of the queue or the head or we can say from where it removes */
public class QueueDemo {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        /* Here LinkedList is acting like Stack */
        stack.addFirst(12);
        stack.addFirst(34);
        stack.addFirst(66);
        stack.removeFirst();
        System.out.println(stack);

        /* LinkedList can also act as Queue */
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(23);
        queue.addLast(43);
        queue.addLast(21);
        queue.removeLast();
        System.out.println(queue);

        /* QUEUE class Implementation of Java */
        Queue<Integer> queue1 = new LinkedList<>(); /* here LinkedList is the implementation class of the Queue Interface
        Collection
           ↑
       Queue (Interface)
           ↑
        Deque (Interface)
           ↑ implements
        LinkedList (Class) */
        queue1.add(12);
        queue1.add(23); 
        queue1.add(43);
        queue1.add(32);
        queue1.add(33);
        queue1.add(78);
        System.out.println(queue1);
        queue1.remove();
        System.out.println(queue1);
        System.out.println(queue1.peek());

        System.out.println(queue1.size()); // returns the size
        System.out.println(queue1.remove()); // throws exceptions if empty
        System.out.println(queue1.poll()); // does not throw empty if empty rather returns null

        System.out.println(queue1.element());
        System.out.println(queue1.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(34));
        System.out.println(queue2.offer(21));

        System.out.println(queue2.offer(45));
/*
add() vs offer()

add(element):
- Inserts element into queue
- Returns true if successful
- Throws IllegalStateException if queue is full

offer(element):
- Inserts element into queue
- Returns true if successful
- Returns false if queue is full
- Does NOT throw exception

Recommendation:
- Prefer offer() for Queue implementations
- offer() handles insertion failure gracefully
*/

    }
}
