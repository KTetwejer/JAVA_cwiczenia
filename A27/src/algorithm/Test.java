package algorithm;

import java.util.Arrays;

public class Test
{
    public static <T> void fillWithElement(T[] tab, T o) {
        if (tab == null || tab.length == 0) {
            System.out.println("Błędna tablica");
        }
        else {
            Arrays.fill(tab, o);
        }
    }

    public static void main(String[] args) {
        Integer[] tab = {1, 1, 1, 1, 1};
        fillWithElement(tab, 6);
        System.out.println(Arrays.toString(tab));
    }
}
