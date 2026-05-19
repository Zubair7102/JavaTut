package Collections.ImmutableMapTut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 2);
        map.put("C", 4);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map);
        /* Collections.unmodifiableMap(map) returns a read-only version of the map.
        That means:
        You can read data
        But you cannot modify it using map2

        Important Concept
        map2 is not a completely separate immutable map.
        It is just an unmodifiable wrapper around the original map.
        So if original map changes, map2 also reflects those changes.*/

        try{
            map2.put("S", 7); // Throws Exception
            map2.put("A", 6); // Throws Exception
        }
        catch (Exception a)
        {
            System.out.println(a);
        }

        //Clean Way to create an immutable Map -->
        Map<String, Integer> map3 = Map.of("Zubair", 98, "Sonu", 89);
        try{
            map3.put("Akshit", 88);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
