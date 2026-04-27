package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(23);
        linkedList.add(34);
        linkedList.add(87);
        System.out.println(linkedList.get(2)); // Time Complexity -> O(n)
        linkedList.addLast(34);
        linkedList.addFirst(1);
        System.out.println(linkedList);
        linkedList.removeIf(x -> x%2 == 0);
        System.out.println(linkedList);

//        to create on the go linked
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Zebra", "Lion"));
        System.out.println(animals);
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);

    }
}
