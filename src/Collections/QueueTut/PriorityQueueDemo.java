package Collections.QueueTut;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        /* PriorityQueue is a Queue implementation where elements are processed based on their priority, not insertion order.

        * Iterable (Interface)
                   ↑
        Collection (Interface)
                   ↑ extends
        Queue (Interface)
                   ↑ implemented by
        AbstractQueue (Abstract Class)
                   ↑ extended by
        PriorityQueue (Class) */

        /*
PriorityQueue:
- Queue based on priority, not insertion order
- Uses Binary Heap internally
- Default: Min Heap (smallest element first)
- Can create Max Heap using Comparator.reverseOrder()
- offer() -> O(log n)  --> add() alternate
- poll() -> O(log n) --> remove() alternate
- peek() -> O(1)
- Null elements not allowed
*/

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        System.out.println(pq.add(23));
        pq.add(3);
        pq.add(43);
//        System.out.println(pq); // this does not give Sorted view
//        System.out.println(pq.peek());
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());

        while (!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.poll();
        }

    }
}
