package Collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        ArrayList<Integer> arr = new ArrayList<>(1000);
//        ArrayList<Integer> arr = new ArrayList<>(1000);
//        1. ArrayList<Integer>
//        ArrayList is a class from Java Collections Framework.
//<Integer> is a generic type → it means this list will store only Integer objects (not int directly).
//        Java automatically converts int ↔ Integer using autoboxing/unboxing.
//        2. arr
//        This is a reference variable.
//                It will point to the ArrayList object created in memory (heap).
//        3. new ArrayList<>(1000)
//        new → creates an object in memory.
//                ArrayList<>(1000) → calls a constructor with initial capacity = 1000.
        System.out.println(arr.size()); // the initial size of arr is 0 and its capacity is 10 that means initially the arr can store max 10 elements before resizing

        arr.add(7);
        arr.add(45);
        arr.add(34);
        arr.add(55);
        System.out.println(arr.get(2));
        System.out.println(arr.get(0));
        for(int x: arr)
        {
            System.out.println(x);
        }
        System.out.println(arr.contains(34));
        arr.remove(2);
        for(int x: arr)
        {
            System.out.println(x);
        }
        arr.add(2, 67); //this will set 67 at index 2 and shift the arr elements accordingly
        printArr(arr);
        arr.set(1, 98); // this will not shift the arr and add the value 98 at index 1 but it will just replace the index 1 value with value 98
        printArr(arr); //instead of using printArr method we can also use below sout way
        System.out.println(arr);

        arr.trimToSize(); // this method helps to automatically trim the excess size of the arr manually else it will not trim the size even if you remove elements from the arr

//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(arr);
//        System.out.println("ArrayList capacity: " + elementData.length);
//        arr.add(1);
//        elementData = (Object[]) field.get(arr);
//        System.out.println("ArrayList Capacity: " + elementData.length);
//
//        arr.remove(2);
//
//        elementData = (Object[]) field.get(arr);
//        System.out.println("ArrayList Capacity: " + elementData.length);


    }

//    Method to print arr elements
    static void printArr(List<Integer> arr)
    {
        for(int x: arr)
        {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }


}
