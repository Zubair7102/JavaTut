package Collections.MapTut;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Zubair");
        map.put(2, "Rahul");
        map.put(3, "Rohit");
        map.put(null, "Bansal");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Zubair"));
        System.out.println(map.containsValue("Sonu"));

        String s = map.get(3); // returns String
//        Loop:
        Set<Integer> keys = map.keySet(); // keySet() is a method that returns a set of all keys present in the map
        /* keySet() = all keys of the map as a Set */
        for(int i: keys)
        {
            System.out.println(map.get(i));
        }

        System.out.println("Entry Set.................................................");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        /* entrySet() returns a set of key–value pairs , Each pair is represented by Map.Entry
        Map.Entry<Integer, String> Represents one entry
        Set<Map.Entry<Integer, String>> A Set of all entries
        map.entrySet() Returns all entries from the map*/

        for(Map.Entry<Integer, String> entry: entries)
        {
//            System.out.println(entry);
//            System.out.println(entry.getKey() + ": " + entry.getValue() );
            entry.setValue(entry.getValue().toUpperCase());
            /* What happens:
            entry.getValue() → gets current value (String)
            .toUpperCase() → converts to uppercase
            entry.setValue(...) → updates the value in the map */
        }
        System.out.println("The entries are " + entries); /* Output format: Square brackets [] → because it’s a Set */
        System.out.println("The map values are " + map); /* map is a HashMap, Output Format: Curly braces {} → standard Map representation */
    }
}
