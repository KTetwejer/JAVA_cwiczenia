package moto;

import java.util.Arrays;

public class TestVehicle
{
    public static <T extends Comparable<T>> T maxValue(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Błędna tablica");
        }
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Vehicle[] arr = {
                new Vehicle("Astra G", 130),
                new Vehicle("Fabia", 100),
                new Vehicle("Yaris", 90),
        };
        System.out.println(maxValue(arr));
    }
}
