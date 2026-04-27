package OOPS_Inheritance.Humans;

public class Child extends Parent{

    public Child(int age, String name)
    {
        super(age, name);
        System.out.println("Child Constructor is called");
    }

    public void childMethod()
    {
        super.parentMethod(); //super(); method can be called anywhere in any method or its respective constructor
        System.out.println("Child Method Called");
    }
}
