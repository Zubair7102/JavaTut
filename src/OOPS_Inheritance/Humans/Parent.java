package OOPS_Inheritance.Humans;

public class Parent extends Grandparent {

//    String name;
//    int age;
//
////    Getters and Setters
//    public String getName()
//    {
//        return name;
//    }
//
//    public int getAge()
//    {
//        return age;
//    }
//
//    public void setName(String name)
//    {
//        this.name = name;
//    }
//
//    public void setAge(int age)
//    {
//        this.age = age;
//    }
//
////    Constructor
    public Parent(int age, String name)
    {
        super(age, name);
        System.out.println("Parent Constructor is called");
    }

    public void parentMethod()
    {
        System.out.println("Parent method called");
    }


}
