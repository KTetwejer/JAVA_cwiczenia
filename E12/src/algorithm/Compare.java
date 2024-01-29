package algorithm;

public class Compare
{
    public static <T> boolean compareThree(T o1, T o2, T o3) {
        return (o1.equals(o2) && o1.equals(o3));
    }
}
