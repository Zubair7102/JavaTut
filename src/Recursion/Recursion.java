package Recursion;
//A method which call itself is known as recursion
public class Recursion {

    public static int factorialN(int n)
    {
//        base case
        if(n == 1)
        {
            return 1;
        }

        return n * factorialN(n-1);
    }

//    Sum Of N Natural Numbers
    public static int nSum(int n)
    {
//        base case
        if(n == 1)
        {
            return 1;
        }

        return n + nSum(n-1);
    }

    public static void main(String[] args)
    {
        System.out.println(factorialN(6));
        System.out.println(nSum(5));
    }
}
