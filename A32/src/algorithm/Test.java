package algorithm;

public class Test
{
    public static <T extends Comparable<T>> boolean isSecondGreater(T a, T b) {
        if(a == null || b == null) {
            throw new NullPointerException("Wrong argument");
        }
        return a.compareTo(b) < 0;
    }

    public static void main(String[] args) {
        System.out.println(isSecondGreater(1, 5));
        System.out.println(isSecondGreater(5, 1));
    }
}
