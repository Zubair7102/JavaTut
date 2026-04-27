package GenericsTut;

import java.util.ArrayList;

//Benefits of using Generics: Type Safety, No Manual casting and to avoid any run time issue
public class GenericsTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); //here we are defining that the ArrayList will store only String values to avoid Type Safety Issue
        list.add("Zubair");
        list.add("Ankita");
        list.add("Kaushtub");
        list.add("wasif");
        System.out.println(list.get(2));
        String s1 = list.get(0);
        System.out.println(s1);


    }
}
