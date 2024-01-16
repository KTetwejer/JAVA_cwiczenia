package university;

import java.util.Arrays;

public class Median
{
    public static <T extends Comparable<T>> T findMedian(T[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        Arrays.sort(arr);
        T median = arr[arr.length/2];
        return median;
    }
}
