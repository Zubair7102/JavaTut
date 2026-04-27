package OOPS_Inheritance.Humans;

public class Grandparent {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    Constructor
    public Grandparent(int age, String name)
    {
        this.age = age;
        this.name = name;
        System.out.println("Grandparent Constructor is called");
    }

}
