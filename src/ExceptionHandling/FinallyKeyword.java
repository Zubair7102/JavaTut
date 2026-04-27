package ExceptionHandling;

public class FinallyKeyword {
    public static void main(String[] args) {
        System.out.println(divide(2, 0));
    }

    public static int divide(int a, int b)
    {
        try{
            return a/b;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return -1;
        }
        finally {
//            finally block ensure that anything written in finally block will execute even if try catch execute or not
            System.out.println("Bye");
        }

    }
}
