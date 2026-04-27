package OOPS_Inheritance.Animals;

public class Animal {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("This is Animal Eat Method");
    }
//    Constructor
    public Animal()
    {
        System.out.println("Animal Constructor is called");
    }

    public void sayHello(){
        System.out.println("Animal Growls");
    }
//
//    public static void main(String[] args) {
//        Animal dog = new Animal("german", 12);
////        dog.age = 12;
////        dog.name = "german";
//        System.out.println(dog.age);
//    }



}
