package Collections.SortedMapTut;

import java.io.StringReader;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
//Sorted Map is an interface and TreeMap is its implementation.
/* SortedMap extends Map so inplace of Sortedmap we can also write Map like:
* Map<String, Integer> map = new TreeMap<>(); */
/* SortedMap is an interface that extends Map and guarantees that the entries are sorted based on the keys, either in their natural ordering or by a specific comparator. */
public class SortedMapDemo1 {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Zubair", 92);
        map.put("Ankita", 98);
        map.put("Mohit", 86);
        map.put("Ravi", 78);
        map.put("Kaici", 92);
        System.out.println(map);
        /* here sorting is being done on basis of key and here key is String so sorting is being made according to names */
        for(Map.Entry<String, Integer> i : map.entrySet())
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Ravi")); // here ravi is excluded
        System.out.println(map.tailMap("Mohit")); // here mohit is included
        System.out.println(map.subMap("Ankita", "Ravi")); // here Ankita is included and Ravi is excluded


        Map<Integer, String> map1 = new TreeMap<>((a, b) -> b-a); // we can also give Comparator defining in which order we want the sorting, like here we are adding lambda function to sort in descending order
        System.out.println();
        map1.put(66, "Zubair");
        map1.put(55, "Ravi");
        map1.put(67, "Ankita");
        map1.put(54, "Mohit");
        System.out.println(map1); // Descending Order Sorting
        System.out.println();
        for(Map.Entry<Integer, String> l : map1.entrySet())
        {
            System.out.println(l);
        }
    }
}
