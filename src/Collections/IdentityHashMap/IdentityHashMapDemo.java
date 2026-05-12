package Collections.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
//        Map<String, Integer> map = new HashMap<>();
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode()); /* this and below line will give same hashcode as it validates on content */
        System.out.println(key2.hashCode());
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
//        System.out.println(key1.equals(key2)); // as value of both key1 and key2 are equal then key2 will replace key1 in map
        System.out.println(map);
    }
}
