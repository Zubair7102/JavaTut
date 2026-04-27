package OOPS_Inheritance.Animals;

public class Dog extends Animal {

    public Dog()
    {
        System.out.println("Dog Constructor is called");
    }

    //    this is known as method overriding
    @Override
    public void sayHello()
    {
        System.out.println("Dog Barks");
    }

    public void eat()
    {
        System.out.println("Dog is eating");
    }
}
