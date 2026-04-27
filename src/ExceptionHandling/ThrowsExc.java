package ExceptionHandling;

import java.io.FileReader;

public class ThrowsExc {
    public static void main(String[] args) throws Exception
    {
        method2();
    }

    public static void method2()
    {
        try{
            method1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void method1() throws Exception
    {
        FileReader fileReader = new FileReader("a.txt");
    }
}
