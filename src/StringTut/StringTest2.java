package StringTut;

public class StringTest2 {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i< 10000; i++)
        {
            result += " Hello ";
        }
        System.out.println(result);
    }
}
