package Polymorphism;

//This is example of compile time polymorphism / method overloading
public class CompileTime {

    public int add(int a, int b)
    {
        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTime c = new CompileTime();
        System.out.println(c.add(2, 6, 7));
        System.out.println(c.add(34, 67));
        System.out.println(c.add(34.68, 89.39));
    }
}
