package GenericsTut;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class GenericsTest extends Object {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();  // here list stores object type values. Note: here we get Type Safety Issue.
        list.add("Zubair");
        list.add(123);
        list.add(3.14);
        Object o = list.get(0);
        System.out.println(o);
        String str = o.toString();
        String str1 = (String) list.get(0); //here we are casting object to String.
        System.out.println(str);
//        Integer integer = list.get(1);
        Object o1 = list.get(1);
        System.out.println(o1); // printing
        Integer integer1 = (Integer) list.get(1); //here are casting object in "list.get(1)" to Integer type variable integer1;
        System.out.println(integer1); //Printing
        try
        {
            String integer2 = (String) list.get(1);
        }catch(Exception a)
        {
            System.out.println(a.getMessage());
        }

    }
}
