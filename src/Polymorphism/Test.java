package Polymorphism;

import OOPS_Inheritance.Animals.Animal;
import OOPS_Inheritance.Animals.Dog;
//This is example of run time polymorphism/method overriding
public class Test {
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal();
        myAnimal.sayHello();

//       Dynamic Method Dispatch/ Upcasting
        Animal animal = new Dog();
        animal.sayHello(); //here animal object can only access methods and attributes of Animal class as animal object is of reference Animal class and can not access Dog class methods or attributes

        double d = 2.34345;
        int e = (int)d;
        System.out.println(e);

        Dog dog =  (Dog) animal; //Downcasting


    }
}
