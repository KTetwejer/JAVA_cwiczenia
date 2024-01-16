package algorithm;

public class Compare
{
    public static <T> boolean compareThree (T a, T b, T c) {
        return (a.equals(b) && b.equals(c));
    }

    public static void main(String[] args) {
        System.out.println(compareThree(1, 1, 1));
        System.out.println(compareThree(1, 2, 3));
        System.out.println(compareThree("a", "a", "a"));
    }
}
