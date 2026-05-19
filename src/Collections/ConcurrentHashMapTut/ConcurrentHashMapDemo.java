package Collections.ConcurrentHashMapTut;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* ConcurrentMap is an interface for Thread Safe Map Operations and it extends Map<k, v>
* and
* ConcurrentHashMap is the main implementation of concurrentMap
*                ┌─────────────────────┐
                 │      Map<K,V>       │
                 │     (Interface)     │
                 └─────────────────────┘
                            ▲
                            │
                         extends
                            │
                 ┌─────────────────────┐
                 │ ConcurrentMap<K,V>  │
                 │     (Interface)     │
                 └─────────────────────┘
                            ▲
                            │
                        implements
                            │
            ┌────────────────────────────────┐
            │ ConcurrentHashMap<K,V>         │
            │           (Class)              │
            └────────────────────────────────┘
            * */

/* Java 7 --> segment based loacking --> 16 segments --> smaller HashMaps
* Only the segment being written to or read from is locked
* read: do not require locking unless there is a write operation happening on the same segment
* write: Lock
*
* Java 8 --> No Segmentation
* --> compare And Swap appraoch --> No Locking except resizing or collision  */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();


        /*
ConcurrentSkipListMap:
- Thread-safe
- Sorted by keys
- Uses Skip List internally
- O(log n) operations

ConcurrentSkipListMap is a: thread-safe + sorted map
*/
        ConcurrentSkipListMap<Integer, String> map1 = new ConcurrentSkipListMap<>();
        map1.put(3, "a");
        map1.put(2, "c");
        map1.put(4, "b");
        System.out.println(map1);
        for(Map.Entry<Integer, String> entry : map1.entrySet())
        {
            System.out.println(entry);
        }


    }
}
