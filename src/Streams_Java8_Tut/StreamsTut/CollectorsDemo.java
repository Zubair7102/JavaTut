package Streams_Java8_Tut.StreamsTut;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        /* Collectors is a utility class in Java Stream API (java.util.stream.Collectors) that provides ready-made operations to collect stream elements into a final result.
     */

//        1. Collectors.toList() -> converts Stream to List
        List<String> names = Arrays.asList("Zubair", "Almaas", "Ahzem", "Bob");
        System.out.println(names.stream().collect(Collectors.toList()));

//        2. Collectors.toSet -> Converts Stream to set ((Actual order may vary because HashSet is unordered.))
        System.out.println(names.stream().collect(Collectors.toSet()));

//        3. Collectors.toMap() Converts Stream -> Map
        System.out.println(names.stream().collect(Collectors.toMap(name -> name,name -> name.length())));

//        4. Collectors.joining() -> Joins String Together
        System.out.println(names.stream().collect(Collectors.joining(", ")));

//        5. Collectors.counting() Counts elements
        System.out.println(names.stream().collect(Collectors.counting()));

//        6. Collectors.summingInt() Calculates sum
        List<Integer> num = Arrays.asList(1, 4, 6, 8, 3);
        System.out.println(num.stream().collect(Collectors.summingInt(x -> x)));

//        7. Collectors.averagingInt() Calculates average
        System.out.println(num.stream().collect(Collectors.averagingInt(x-> x)));

//        8. Collectors.groupingBy() Groups elements based on a condition/key.
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length)));

//        9. Collectors.partitioningBy() Splits data into exactly two groups.
        System.out.println(num.stream().collect(Collectors.partitioningBy(x->x%2==0)));

//        10. Collectors.mapping used inside grouping
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.toList()))));

    }
}
