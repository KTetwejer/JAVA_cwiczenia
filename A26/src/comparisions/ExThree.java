package comparisions;

public class ExThree
{
    public static <T extends Comparable<T>> boolean isFirstLargest(T a, T b, T c) {
        return a.compareTo(b) > 0 && a.compareTo(c) > 0;
    }

    public static void main(String[] args) {
        System.out.println(isFirstLargest(5, 2, 3));
        System.out.println(isFirstLargest("d", "b", "c"));
        System.out.println(isFirstLargest(5.5, 3.0, 2.3));
        System.out.println(isFirstLargest(1.0, 1.1, 0.9));
    }
}
