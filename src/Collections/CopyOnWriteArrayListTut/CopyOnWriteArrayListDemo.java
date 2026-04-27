package Collections.CopyOnWriteArrayListTut;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        /* "Copy On Write" means that whenever a write operation like adding or removing an element is performed then instead of directly modifying the existing list a new copy of the list is created and the modification is performed to that copy.
        * This ensure that other threads reading the list while it's being modified are unaffected. */

        /* Read Operations: Fast and direct, since they happen on a stable list without interference from modification.
        * Write Operations: A new copy of the list is created for every modification.
        * The reference is then updated so that subsequent reads use this new list  */
        // We will be using the CopyOnWriteArrayList when read intensive operations are performed.

//        List<String> shoppingList = new ArrayList<>();
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        for(String str: shoppingList)
        {
            System.out.println(str);
//            Try to modify the list while reading
            if(str.equals("Eggs"))
            {
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        System.out.println("Updated Shopping List " + shoppingList);


    }
}
