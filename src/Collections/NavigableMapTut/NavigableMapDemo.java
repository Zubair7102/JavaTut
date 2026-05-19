package Collections.NavigableMapTut;

import java.util.NavigableMap;
import java.util.TreeMap;
/*                     JAVA MAP HIERARCHY
                    ==================

                          Map<K,V>
                         (Interface)

        ------------------------------------------------
        |                      |                      |
        |                      |                      |
     HashMap              SortedMap              Hashtable
      (Class)             (Interface)              (Class)
        |                      |
        | implements           | extends
        |                      |
        |                 NavigableMap
        |                   (Interface)
        |                      |
        |                      | extends
        |                      |
   LinkedHashMap           TreeMap
      (Class)               (Class)
        |                      |
        | extends              | implements
        |                      |
     HashMap             NavigableMap


                    JAVA MAP HIERARCHY
                    ==================

                    ┌─────────────────┐
                    │   Map<K,V>      │
                    │   (Interface)   │
                    └─────────────────┘
                             ▲
                             │
                           extends
                             │
                    ┌─────────────────┐
                    │ SortedMap<K,V>  │
                    │   (Interface)   │
                    └─────────────────┘
                             ▲
                             │
                           extends
                             │
                    ┌────────────────────┐
                    │ NavigableMap<K,V>  │
                    │    (Interface)     │
                    └────────────────────┘
                             ▲
                             │
                         implements
                             │
                    ┌─────────────────┐
                    │  TreeMap<K,V>   │
                    │    (Class)      │
                    └─────────────────┘



                    ┌─────────────────┐
                    │   Map<K,V>      │
                    │   (Interface)   │
                    └─────────────────┘
                             ▲
                             │
                         implements
                             │
                    ┌─────────────────┐
                    │  HashMap<K,V>   │
                    │    (Class)      │
                    └─────────────────┘
                             ▲
                             │
                           extends
                             │
                    ┌──────────────────────┐
                    │ LinkedHashMap<K,V>   │
                    │       (Class)        │
                    └──────────────────────┘



                    ┌─────────────────┐
                    │   Map<K,V>      │
                    │   (Interface)   │
                    └─────────────────┘
                             ▲
                             │
                         implements
                             │
                    ┌─────────────────┐
                    │ Hashtable<K,V>  │
                    │    (Class)      │
                    └─────────────────┘
     */

/* NavigableMap is an interface in Java that extends SortedMap.
It provides:
Navigation methods for sorted maps
Meaning:
find nearest key
previous key
next key
first/last entries
etc.

Hierarchy
Map
  ↓
SortedMap
  ↓
NavigableMap
  ↓
TreeMap

TreeMap implements NavigableMap */

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(66, "Zubair");
        map.put(55, "Ravi");
        map.put(67, "Ankita");
        map.put(54, "Mohit");
        System.out.println(map);
        System.out.println(map.lowerKey(55));
    }
}
