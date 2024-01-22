package algorithm;

import java.util.Arrays;

public class ExFour
{
    public static <T> void updateAtIndex(T[] tab, int index, T element) {
        tab[index] = element;
    }

    public static void main(String[] args) {
        Double[] tab = {1.0, 2.5, 3.4, 4.6, 5.22};
        System.out.println(Arrays.toString(tab));
        updateAtIndex(tab, 1, 5.1);
        System.out.println(Arrays.toString(tab));
    }
}
