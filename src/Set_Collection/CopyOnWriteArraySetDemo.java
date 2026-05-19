package Set_Collection;

import Collections.LinkedList.LinkedListTest;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
/* Feature CopyOnWriteArraySet
    Thread-safe	- Safe for multiple threads
    No duplicates - Set property
    Maintains insertion order - Yes
    Read operations very fast - Excellent for reads
    Write operations expensive - Copies entire array
    Iterator is fail-safe - No ConcurrentModificationException
    Null allowed - no null allowed */
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(12);
        set.add(56);
        set.add(23);
        System.out.println(set);
        for(int i: set)
        {
            set.add(121);
        }
        System.out.println(set);
    }
}
