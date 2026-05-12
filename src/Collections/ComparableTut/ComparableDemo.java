package Collections.ComparableTut;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
Comparable vs Comparator

Comparable:
- Used for natural/default sorting
- Implemented inside the class
- Uses compareTo()
- Only one sorting logic possible

Comparator:
- Used for custom sorting
- Implemented outside the class
- Uses compare()
- Multiple sorting logics possible

Comparable → "I can sort myself"
Comparator → "Someone else sorts me"
*/

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Zubair", 4.6));
        list.add(new Student("Farida", 4.9));
        list.add(new Student("Ankita", 4.2));
        list.add(new Student("Bob", 3.8));
        list.add(new Student("Akshat", 3.2));
//        System.out.println(list);
//        for(Student s: list)
//        {
//            System.out.println(s);
//        }
        list.sort(null);
        System.out.println(list);




    }
}


