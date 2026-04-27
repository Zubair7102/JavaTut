package Collections;

import java.util.*;

class StringLengthComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length(); // this is sorting as per the length of the words
    }

}

class MyComparator implements Comparator<Integer>{

    @Override
/* Logic: if int is negative that means o1 is smaller than o2 and will come before o2
* if int value is 0 then it means o1 is equal to o2
* if int comes greater than 0 then it means o1 is greater than o2 and will come after o2 */
    public int compare(Integer o1, Integer o2) {
//        return o1 - o2; // this will return ascending order
        return o2 - o1; // this will return descending order
    }
}
public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(1); // here 1 is the index and not object
        list.remove(Integer.valueOf(2)); // here 2 is the object and not any index
        System.out.println(list);
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.remove("Apple"); //here apple is the object and not index
        boolean hasApple = list.contains("Apple"); // this will return true if the "Apple" is present
        System.out.println(fruits.contains("Banana"));

//        we can also convert list into an array
//        String[] arr = list.toArray(new String[0]);
        Object[] array = list.toArray(); // here the variable type is object because no type is mentioned
        Integer[] array1 = list.toArray(new Integer[0]);

//        we can also sort the array
        Collections.sort(list);
        list.sort(null); // here instead of null we can write comparator -> comparator is an interface using which we can implement custom ordering. Here we have written null so by default it will take ascending order
        list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);
//        words.sort((a, b) -> a.length() - b.length()); here we are using lambda expression


    }
}
