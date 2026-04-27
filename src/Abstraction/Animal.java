package Abstraction;

public abstract class Animal {

//    constrcutor
    public Animal()
    {

    }

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    this is an abstract method -> a method that does not have any body and is meant to be inherited
//    Note: an abstract method can never be private
    public abstract void sayHello();

//    this is a concrete method
    public void sleep()
    {
        System.out.println("zzzz...");
    }

}
