package Collections.ComparableTut;
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
public class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Student(String name, double gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa());
    }
}
