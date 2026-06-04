package Streams_Java8_Tut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        /* A Predicate is a Functional Interface introduced in Java 8 that is used to test a condition and return a boolean result. */
        Predicate<Integer> isEven = num -> num%2 == 0;
        System.out.println( isEven.test(34));

        Predicate<String> isWordStartWithA = x -> x.startsWith("A");
        System.out.println(isWordStartWithA.test("Zubair"));
        System.out.println(isWordStartWithA.test("Ankita"));

        Predicate<String> isWordEnsWithT = x -> x.toLowerCase().endsWith("t");
        System.out.println(isWordEnsWithT.test("Kat"));

        Predicate<String> and = isWordStartWithA.and(isWordEnsWithT);
        System.out.println(and.test("Azu"));


//        Function --> Work For You
        Function<Integer, Integer> doubleIt = x-> x*2;
        System.out.println(doubleIt.apply(22));

        Function<Integer, Integer> tripleIt = x -> 3*x;
        System.out.println(tripleIt.apply(23));
        System.out.println(tripleIt.andThen(doubleIt).apply(2));

//        Static Method
        Function<Integer, Integer> identify = Function.identity();
        Integer apply = identify.apply(6);
        System.out.println(apply);

//        Consumer
        /* A Consumer is a Functional Interface that accepts a value and performs some operation on it, but does not return anything. */
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<List<Integer>> printList = x -> {
            for(int i:x)
            {
                System.out.println(i);
            }
        };
        printList.accept(list);


//        Supplier
        /* A Supplier is a Functional Interface that supplies (provides) a value without taking any input. */
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());


//        Combined Example
        Predicate<Integer> predicate = x-> x%2==0;
        Function<Integer, Integer> function = x -> x*x;
        Consumer<Integer> consumer = x-> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get()))
        {
            consumer.accept(function.apply(supplier.get()));
        }


        /* BiPredictae, BiFunction, BiConsumer  these take 2 paramters */
        BiPredicate<Integer, Integer> isSumEven = (x , y ) -> (x + y)% 2 == 0;
        System.out.println(isSumEven.test(2, 4));

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept(2, 7);

        BiFunction<String, String, Integer> biFunction = (a, b) -> (a+b).length();
        System.out.println(biFunction.apply("Zubair", "Ahmed"));


//        here binaryOperator and UnaryOperator extends Function class hence instead of writing Function<Integer, Integer> 2 times we can use UnaryOperator and BinaryOperator and write single Type if all the types are same.
        UnaryOperator<Integer> a = x-> 2*x;
        BinaryOperator<Integer> b = (x, y) -> (x*y);


//        Method Reference --> use method without invoking & in place of Lambda expression
        /* A Method Reference is a shorthand syntax for a lambda expression that simply calls an existing method. */
        List<String> students = Arrays.asList("Ram", "Shyam", "Rahul");
        students.forEach(x-> System.out.println(x));
        students.forEach(System.out::println); /* The :: operator is called the Method Reference Operator. */

        /* Constructor Reference -> A Constructor Reference is a special type of Method Reference used to refer to a constructor instead of a normal method. */
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhoneList
 = names.stream().map(MobilePhone::new).collect(Collectors.toUnmodifiableList());

    }
}
class MobilePhone{
    String name;

    public MobilePhone(String name)
    {
        this.name = name;
    }
}
//@FunctionalInterface
//interface Predicate<T>{
//    boolean test(T t);
//}