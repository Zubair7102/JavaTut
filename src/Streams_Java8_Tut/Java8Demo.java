package Streams_Java8_Tut;

public class Java8Demo {
    public static void main(String[] args) {
        /* Java 8 introduced:

Lambda Expressions -> A Lambda Expression is a short way of writing an anonymous function (a function without a name).
Stream API
Functional Interfaces
Method References
Optional
Default & Static Interface Methods
New Date & Time API
CompletableFuture */

        /* Rule to convert method into lambda expression -> remove name, return type and no access modifier(public, private, default, protected)  */

        /* Note: -> Lambda expressions are used to implement FunctionalInterfaces -> now functionalInterfaces are those class which have only one abstract method -> an abstract method is that method which does not have any body */
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Zubair");
            }
        };
        g.sayHello();

        Greeting gh = () -> System.out.println("Hello Zubair");   // this is Java 8 way of writting anonymous class
        gh.sayHello();

        MathOperation mathOperation = (int a, int b) -> {
            return a + b;
        };
        System.out.println(mathOperation.operate(8, 9));

        MathOperation mathOperation1 = (a , b) -> a+b;
        System.out.println(mathOperation1.operate(6,9));

    }


    @FunctionalInterface
    interface Greeting{
        void sayHello();
    }

    @FunctionalInterface
    interface MathOperation{
        int operate(int a, int b);
    }
}
