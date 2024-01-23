package equalitycheck;

public class QualityCheck <T>
{
    public static <T> boolean allEqual(T a, T b, T c) {
        return a.equals(b) && a.equals(c);
    }

    public static void main(String[] args) {
        System.out.println(allEqual(1, 1, 1));
        System.out.println(allEqual(6.1, 6.2, 6.1));
    }
}
