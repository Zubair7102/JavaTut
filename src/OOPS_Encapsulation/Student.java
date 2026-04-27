package OOPS_Encapsulation;

public class Student {
    /* class has properties/fields/instance variable & behaviour/ methods */
        private String name;
        private int rollNo;
        private int age;

//        parameterised Constructor
    public Student(String name, int age, int rollNo)
    {
        this.age = 13;
        this.rollNo = 0;
        this.name = "Student";
        System.out.println("Constructor is called");
    }

//        Encapsulation
//    getter and setter
    public String getName()
    {
        return name;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public int getAge()
    {
        return age;
    }

//    Setters
//    public static void setName(String name)
//    {
//        this.name = name; /* this cannot be used in a static method
//
//this refers to the current object
//
//static methods belong to the class, not to any object
//
//So no object exists for this */
//    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public void setAge(int age)
    {
//        here we are passing the negative age value so here in method we are definig rule that age can never be negative using encapsulation
        if(age >= 0)
        {
            this.age = age;
        }
        else {
            System.out.println("Please enter a valid age");
        }
    }



}
