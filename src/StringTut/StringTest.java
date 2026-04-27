package StringTut;

//Note: Strings are immutable in Java
public class StringTest {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println(str2);
    }
}
