package ExceptionHandling;

//Note: every class in java automatically extends object class
public class ArithmeticExc {
    public static void main(String[] args) {
        int num[] = {10, 200, 30, 40};
        int denom[] = {1, 2, 0, 4};
        for(int i=0; i<num.length; i++)
        {
            System.out.println(divide(num[i], denom[i]));
        }
        System.out.println("Execution complete");
    }

    public static int divide(int a, int b)
    {
        try{
            return a/b;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return -1;
        }
    }
}
