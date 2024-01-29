package university;

import java.util.ArrayList;

public class TestStudent
{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 3.5));
        students.add(new Student("Mary", 3.9));
        students.add(new Student("Peter", 2.8));
        students.add(new Student("Paul", 3.2));
        students.add(new Student("Mary", 3.9));

        System.out.println("Number of students with grade 3.9 and name Mary: " +
                Counter.countElements(students.iterator(), new Student("Mary", 3.9)));
    }
}
