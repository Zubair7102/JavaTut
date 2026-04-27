package Abstraction;


public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sayHello();

        Animal dog = new Dog();
        dog.sayHello();

//        Animal animal = new Animal(); -> we cannot create an object of abstract class
    }
}
