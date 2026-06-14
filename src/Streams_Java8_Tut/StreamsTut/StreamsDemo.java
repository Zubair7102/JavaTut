package Streams_Java8_Tut.StreamsTut;

import Collections.LinkedList.LinkedListTest;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        /* A Stream is a sequence of elements that supports operations such as filtering, sorting, mapping, and collecting data in a declarative (functional) way.
        Think of a Stream as a pipeline through which data flows and gets processed.

        Features:
        1. Streams feature was introduced in Java8
        2. process collections of data in a functional and declarative manner
        3. Simplify Functional Programming
        4. Improves Readability and Maintainability
        5. Enable easy Parallelism

        How to use Streams -> Source, intermediate operations & terminal operations
         */

//        Before Java 8
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        System.out.println(evenNumbers);


//        After Java8
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers1 = list.stream().filter(n -> n%2==0).toList();
        System.out.println(evenNumbers1);

//        Creating Streams
//        1. From Collections
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> listStream = list2.stream();
//        2. From Arrays
        String arrays[] = {"a", "b", "c"};
        Stream<String> strStream = Arrays.stream(arrays);

//        3. using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b");

//        4. Infinite Streams
        Stream<Integer> generate = Stream.generate(() -> 2);

       List<Integer> collect =  Stream.iterate(1, x-> x+1).limit(100).collect(Collectors.toList());
        System.out.println(collect);



    }
}
