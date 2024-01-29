package algorithm;

public class TestStudent
{
    public static void main(String[] args) {
        Student s1 = new Student("Jan", 3.5f);
        Student s2 = new Student("Jan", 3.5f);
        Student s3 = new Student("Jan", 3.5f);
        System.out.println(Compare.compareThree(s1, s2, s3));
    }
}
