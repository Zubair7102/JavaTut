package Collections.VectorTut;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(); // Default capacity is 10
        System.out.println(vector.capacity());
        Vector<Integer> vector1 = new Vector<>(6, 3); // we can also provide by how much the capacity should increase i.e when element added are 6 then capacity will increase and become 6+3 = 9

        Vector<Integer> vector2 = new Vector<>(Arrays.asList(2,3,4,5,6,7));
        System.out.println(vector2);

    }
}
