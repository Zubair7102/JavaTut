package WrapperClass;

public class Test {
    public static void main(String[] args) {
        int a = 1;
//        here int a so here varoiable a is primitive int data type variable and its data is stored in stack memory
        Integer b = 2; // this is known as Autoboxing
        Integer c = Integer.valueOf(3); // this line is detailed syntax of what is happening in line 7
        int d = b.intValue(); // this is known as unboxing
// Integer is class and variable b/c are its object
        
//        here Integer b is reference variable of primitive data type int, so here variable b is object and its data is stored in heap memory
        boolean isGeneric = true;
        Boolean isAdult = false;

//        Important:
        Integer f = null; // this wrapper class can have null value but int f = null is not possible as here int is primitive data type

        System.out.println(Integer.max(45, 87));
        System.out.println(Integer.toBinaryString(56));
        String str = "12345";
        Integer i =  Integer.valueOf(str);
//        Note: Integer.valueOf() only accepts numeric strings.
        System.out.println(i);
        String s = "Zubair";
        try{
            Integer j = Integer.valueOf(s);
            System.out.println(j);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }



    }
}
