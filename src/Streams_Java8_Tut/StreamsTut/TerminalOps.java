package Streams_Java8_Tut.StreamsTut;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        /* Terminal Operations are the operations that:
    Produce the final result
    Trigger execution of the stream pipeline
    End the stream
    Return a value or perform an action */

//        1. Collect -> Collects stream elements into a collection.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> newCollectList = list.stream().skip(1).collect(Collectors.toList());
        System.out.println(newCollectList);

//        2. ForEach -> Performs an action on every element.
        list.stream().forEach(x-> System.out.println("ForEach: " + x));

//        3. Reduce -> reduce() is a Terminal Operation used to combine all stream elements into a single result.
       Optional<Integer> optionalI =  list.stream().reduce((x, y) -> x+y); /* Optional<T> is a container that may or may not contain a value. */
        System.out.println(optionalI.get());


//        4. toList() -> Modern alternative to collect(Collectors.toList())
        System.out.println(list.stream().filter(x -> x%2==0).toList());

//        5. count() -> Counts elements
        System.out.println(list.stream().map(x -> x*x).count());

//        6. findFirst() -> Returns first element as Optional.
        System.out.println(list.stream().findFirst());

//        7. findAny() -> Returns any Element
        System.out.println(list.stream().findAny());

//        8. anyMatch() -> checks if atleast one element matches -> return boolean value
        System.out.println(list.stream().anyMatch(x-> x > 5));

//        9. allMatch() -> checks if all elements match
        System.out.println(list.stream().allMatch(x -> x < 9));

//        10. noneMatch() -> checks if no elements match
        System.out.println(list.stream().noneMatch(x -> x < 0));

//        11. min() -> find smallest elements
        System.out.println(list.stream().min(Integer::compareTo)); /* Integer::compareTo is method reference  */

//        12. max() -> Find the largest element
        System.out.println(list.stream().max(Integer::compareTo));

//        example: Filtering and collecting Names
        List<String> names = Arrays.asList("Anna", "Zubair", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x-> x.length() > 3).toList());

//        example: Squaring and sorting Numbers
        List<Integer> num = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(num.stream().map(x ->x*x).sorted().toList());

//        example: Summing values
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().reduce((x, y) -> x+y));

//        Example: Counting Occurences of a Character
        String sent = "Hello World";
        System.out.println( sent.chars().filter(x-> x == 'l').count());

        /* 1. Stateless Operations
        A Stateless Operation processes each element independently.
        It does not need information about previous or future elements.
        Examples
        filter()
        map()
        peek()
        flatMap() */

        /* 2. Stateful Operations
        A Stateful Operation needs information about multiple elements before producing results.
        It maintains some internal state.
        Examples
        sorted()
        distinct()
        limit()
        skip() */
    }
}
