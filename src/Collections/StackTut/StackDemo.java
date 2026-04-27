package Collections.StackTut;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(55);
        System.out.println(stack);
        Integer removedElement = stack.pop();
        System.out.println(stack);
        System.out.println(removedElement);
        System.out.println(stack.peek());
//        Scanner sc = new Scanner(System.in);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.search(45)); // search returns the index of element you searching-> search include index 1 from start instead of 0.

        System.out.println("LinkedList as Stack......................................");
//        LinkedList as Stack:
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(12);
        linkedList.addLast(23);
        linkedList.addLast(67);
        System.out.println(linkedList.getLast()); //this is like Peek.
        System.out.println(linkedList.removeLast()); // this is like pop
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());

        System.out.println("ArrayList as Stack......................................");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(78);
        arrayList.add(21);
        System.out.println(arrayList.get(arrayList.size() -1)); // this is the Peek
        System.out.println(arrayList.remove(arrayList.size() -1)); //  this is Pop

    }
}
