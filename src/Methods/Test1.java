//package Methods;
//
//public class Test1 {
//    public static int sum(int a, int b) // Method Overloading
//    {
//        return a+b;
//    }
//
//    public static int arrSum(int arr[])
//    {
//        int res = 0;
//        for(int i: arr)
//        {
//            res += i;
//        }
//        return res;
//    }
//
//    public static String trimeString(String str)
//    {
//        return str.trim().toUpperCase();
//    }
//
//    public static int sum(int a, int b, int c ) // Method Overloading
//    {
//        return a+b+c;
//    }
//
//    public static Cat makeCatNameUpperCase(Cat cat)
//    {
//        cat.name = cat.name.toUpperCase();
//        return cat;
//    }
//
//    public static int sumDot(int ...a)
//    {
//        int sum = 0;
//        for(int i: a)
//        {
//            sum += i;
//        }
//        return sum;
//    }
//
//    public static boolean isPrime(int a)
//    {
//        if( a<=1 )
//        {
//            return false;
//        }
//        for(int i = 2; i<=a/2; i++)
//        {
//            if(a%i == 0)
//            {
//                return false;
//            }
//
//        }
//        return true;
//    }
//    public static void main(String[] args)
//    {
////        System.out.println(sum(2, 8));
//        Test1 test = new Test1();
//        System.out.println(test.sum(2,8));
//
//        int arr[] = {1,2,4,5,6,9};
//        int arr2[] = {2,87, 86, 2};
//        System.out.println(arrSum(arr2));
//        System.out.println(arrSum(arr));
//        System.out.println(trimeString("      Zubair  Ahmed   "));
//        System.out.println(sum(2, 7, 4)); // This is Known as Method Overloading
//        System.out.println(sum(3,8));
//
//        Cat a = new Cat();
//        a.name = "Bob";
//        Cat cat = makeCatNameUpperCase(a);
//        System.out.println(cat.name);
//        System.out.println(a.name);
//
//        System.out.println(sumDot(1, 2, 6));
//        System.out.println(isPrime(2));
//
//
//    }
//
//}
//
//
