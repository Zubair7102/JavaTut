package Set_Collection;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        /* Set is a collection that cannot contain duplicate elements
        * faster operations
        * Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        * Set --> HashSet, LinkedHashSet, TreeSet, EnumSet */
        Set<Integer> set = new HashSet<>(); // Set is interface and HashSet is its implementation class.
        set.add(23);
        set.add(43);
        set.add(12);
        set.add(12);
        set.add(43);
        System.out.println(set);
        for(int i: set)
        {
            System.out.println(i);
        }

        Map<Integer, String> map = new HashMap<>(); /* Note remember --> the keys of a hashMap are always a Set as they are always unique no duplicate allowed */
//        Set<Integer> integers = map.keySet();


//        Same as Maps ->
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new TreeSet<>();

        /*For Thread Safety we can create any set Thread safe by passing it into Collections.synchronizedSet(); */
//        Set<Integer> integers = Collections.synchronizedSet(set);

        Set<Integer> set3 = new ConcurrentSkipListSet<>();
        set3.add(12);
        set3.add(56);
        System.out.println(set3);
    }
}
