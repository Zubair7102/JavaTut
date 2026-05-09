package Collections.MapTut.InternalStructureOfHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student student = new Student("Zubair", 1);
        Student student1 = new Student("Rahul", 2);
        Student student2 = new Student("Rohit", 3);
        Student student3 = new Student("Zubair", 1);
        map.put(student, "Java"); //hashcode1 --> Index1;
        map.put(student1, "NodeJS"); //hashcode2 --> Index2;
        map.put(student2, "React"); //hashcode3 --> Index3;
        map.put(student3, "C++"); //hashcode4 --> Index4;

        System.out.println("Hashmap Size: " + map.size());
        System.out.println("Value for Student: " + map.get(student));
        System.out.println("value for Student3: " + map.get(student3));
        System.out.println(student1); //student1 is storing a memory address of Heap memory -> storing data Rahul, 2

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Zubair", 90); //hashcode1 --> Index1;
        map1.put("Kaushtub", 72); //hashcode2 --> Index2;
        map1.put("Wasif", 67); //hashcode3 --> Index3;
        map1.put("Zubair", 99); //hashcode1 --> Index1 --> equals() --> replace
    }
}

class Student{
    private int id;
    private String name;

    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(getClass() != obj.getClass())
        {
            return false;
        }
        Student other = (Student) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "id: "+ id + ", name: "+ name;
    }
}
