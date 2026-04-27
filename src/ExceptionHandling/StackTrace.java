package ExceptionHandling;

public class StackTrace {
    public static void main(String[] args)
    {
//        STACK TRACE
        try{
            level1();
        } catch (Exception o) {
            StackTraceElement[] stackTrace = o.getStackTrace();
            for(int i =0; i< stackTrace.length; i++)
            {
                System.out.println(stackTrace[i]);
            }
        }

    }
    public static void level3()
    {
        int[] arr = new int[5];
        try{
            arr[5] = 10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void level2()
    {
        level3();
    }
    public static void level1()
    {
        level2();
    }
}
