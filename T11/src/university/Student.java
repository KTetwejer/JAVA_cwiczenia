package university;

import java.util.Arrays;

public class Student implements Comparable<Student>
{
    private String name;
    private float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.grade - o.grade);
    }

    public static void main(String[] args) {
        Student[] arr = {new Student("John", 9.21f),
                new Student("Jane", 8.32f),
                new Student("Jack", 13.85f),
                new Student("Jill", 11.93f),};

        System.out.println("Median is: " + Median.findMedian(arr));
    }
}
