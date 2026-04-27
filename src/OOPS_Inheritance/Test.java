package OOPS_Inheritance;

import OOPS_Inheritance.Animals.Cat;
import OOPS_Inheritance.Animals.Dog;
import OOPS_Inheritance.Humans.Child;
import OOPS_Inheritance.Humans.Grandparent;
import OOPS_Inheritance.Humans.Parent;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sayHello();
        dog.setAge(12);
        dog.setName("German");

        Cat cat = new Cat();
        cat.sayHello();

//        this is multilevel inheritance
        Child child = new Child(23, "Zubair");
        System.out.println(child.getName());
        System.out.println(child.getAge());
        child.childMethod();

        Parent parent = new Parent(34, "Zahid");
        System.out.println(parent.getName());
        System.out.println(parent.getAge());

        Grandparent grandparent = new Grandparent(54, "Amantullah");
        System.out.println(grandparent.getAge());
        System.out.println(grandparent.getName());



    }
}
