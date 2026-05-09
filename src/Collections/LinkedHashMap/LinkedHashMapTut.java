package Collections.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/*  LinkedHashMap is not Thread Safe.just like Hashmap    */
public class LinkedHashMapTut {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 03f, true); // LinkedHashMap maintains insertion Order. It is generally as Double Linked List
        /* | Mode                  | Order type      |
        | --------------------- | --------------- |
        | `accessOrder = false` | Insertion order |
        | `accessOrder = true`  | Access order    |
        */
//        HashMap<String, Integer> hashMap = new HashMap<>();
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 18);
        linkedHashMap.put("Guava", 45);
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");

        System.out.println(linkedHashMap);
        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Shubham", 21);
        hashMap1.put("Bob", 80);
        hashMap1.put("Ankit", 32);
        Integer res = hashMap1.getOrDefault("Shubham", 0); // here getorDefault states that if there is a key named Shubham then bring its value else the value will be 0 ( provided in defaultValue ).
        hashMap1.putIfAbsent("Shubham", 9); // this checks if hashmap1 does not include the Shubham then add shubham with value 9 and if already exists then do not add.
        System.out.println(hashMap1);
        System.out.println(res);

    }
}
