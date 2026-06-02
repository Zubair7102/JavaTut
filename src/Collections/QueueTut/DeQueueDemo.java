package Collections.QueueTut;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DeQueueDemo {
    public static void main(String[] args) {
        /*
Deque = Double Ended Queue

- Insert/remove from both ends
- Extends Queue
- Implemented by ArrayDeque and LinkedList
- Can work as Queue (FIFO)
- Can work as Stack (LIFO)
- ArrayDeque is preferred over Stack
*/

        /* Object
             ↑
    Iterable<E>                 (Interface)
              ↑
    Collection<E>               (Interface)
              ↑ extends
    Queue<E>                    (Interface)
              ↑ extends
    Deque<E>                    (Interface)
              ↑
          ├─────────────────────────────┐
          │                             │
    implements                     implements
          │                             │
          ▼                             ▼
    ArrayDeque<E>               LinkedList<E>
       (Class)                     (Class)
       */

        Deque<Integer> deque1 = new ArrayDeque<>();  // faster iteration due to continuous memory locations, low memory consumption, no null allowed so due to these reasons ArrayDequeue is preferred over LinkedList.
        deque1.addFirst(12);
        deque1.offerFirst(14);

        deque1.addLast(34);
        deque1.offerLast(24);

        deque1.removeFirst();
        deque1.removeLast();
        deque1.pollFirst();
        deque1.pollLast();


        Deque<Integer> deque2 = new LinkedList<>(); // linkedlist should be used if we want to insert, delete somewhere in the middle of the queue


    }
}
