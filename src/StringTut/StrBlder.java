package StringTut;
//String is immutable hence new classes were introduced such as StringBuilder, StringBuffer which are mutable

/* StringBuilder working: -> in StringBuilder there exists an array of char length 16, so as soon as we create an object of StringBuilder then an array of length 16 is created, a blank array and we can append characters and as soon as the 16 char length gets full then the size of the array gets doubled that is from 16 to 32.
* Features:
* Mutable
* Method Chaining
*
* Disadvantage:
* StringBuilder is not Thread safe */
public class StrBlder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Zubair");
        sb.append("Ahmed"); /* this will modify the same object sb and no new string is being created*/
        System.out.println(sb);
        sb.append("This is new append").append("This is again new append"); /* here we can chain the append method  */
        System.out.println(sb);
        String str = sb.toString(); // we can also convert this into String
        System.out.println(str);
        sb.insert(1, "Mohd");
        sb.replace(1, 3, "Sonu");
        sb.delete(1, 6);
        sb.reverse();
        sb.charAt(7);
        sb.length();
        sb.substring(3, 6);
    }
}
