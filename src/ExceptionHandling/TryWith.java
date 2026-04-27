package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWith {
    public static void main(String[] args) {
//        here in this code we do not require to use finally block to close the reader.close() as anything written inside try() will automatically get closed after completion
        try(BufferedReader reader = new BufferedReader(new FileReader("eg.txt")))
        {
            String line;
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
