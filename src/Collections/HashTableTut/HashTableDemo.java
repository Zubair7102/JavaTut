package Collections.HashTableTut;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        /* HashTable is synchronized -> is thread safe
        * no null key or value
        * Legacy Class, ConcurrentHashMap
        * Only Linked List is used if any collision is encountered
        * slower than HashMap */
        hashtable.put(1, "Apple");
        hashtable.put(3, "Orange");
        hashtable.put(5, "Cherry");
        System.out.println(hashtable);
    }
}
