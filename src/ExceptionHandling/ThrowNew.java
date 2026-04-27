package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowNew {
    public static void main(String[] args) {
        try{
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void test() throws Exception
    {
        try{
            FileReader fileReader = new FileReader("a.txt");
        }
        catch (Exception a)
        {
            System.out.println(a.getMessage());
            throw new FileNotFoundException();
        }
    }
}
