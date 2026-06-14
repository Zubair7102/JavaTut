package Streams_Java8_Tut.StreamsTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        /* Intermediate Operations are operations that:
        Work on a Stream
        Return another Stream
        Are lazy (they don't execute immediately)
        Can be chained together */

//        1. Filter -> Used to keep only those elements that satisfy a condition.
        List<String> list = Arrays.asList("Zubair", "Ahmed", "Mohd"); // this is array with fixed size
        List<String> list1 = new ArrayList<>(); // this is resizable array

        List<String> filteredStream =  list.stream().filter(x -> x.startsWith("A")).toList();
        System.out.println(filteredStream);

//        2. Map -> Used to convert one element into another.
        List<String> nameUpperCase = list.stream().map(x-> x.toUpperCase()).toList();
        System.out.println(nameUpperCase);

//        3. Sorted --> Sorts elements in natural order.
        Stream<String> sortedStream = list.stream().sorted();
        sortedStream.forEach(System.out::print);
        List<String> sortedStreamNames = list.stream().sorted().toList();
        System.out.println();
        System.out.println(sortedStreamNames);
//        Sorting with Custom comparator
        List<String> customSortingUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length() ).toList();
        System.out.println(customSortingUsingComparator);

//        4. Distinct --> Keeps only unique elements.
        List<String> distictFilter = list.stream().filter(x -> x.startsWith("A")).distinct().toList();
        System.out.println(distictFilter);

//        5. Limit -> Returns only the first n elements.
        System.out.println(Stream.iterate(1, x-> x+1).limit(100).count());

//        6. skip -> Ignores the first n elements.
        System.out.println(Stream.iterate(1, x-> x+1).skip(10).limit(100).count()); /* starts from 11 and goes to 110 as 100 elemets are needed (maxSize: 100) */

//        7. Peek -> Used to inspect elements while the stream is processing.
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> peekList = list3.stream().peek(x-> System.out.println("Before " + x)).map(x-> x*x).toList();
        System.out.println(peekList);
    }
}
