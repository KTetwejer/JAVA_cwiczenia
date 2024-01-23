package filtering;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static <T extends Comparable<T>> List<T> filterGreaterThan(ArrayList<T> tab, T f) {
        ArrayList<T> result = new ArrayList<>();
        for (T t : tab) {
            if (t.compareTo(f) > 0) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(4);

        for (Integer element : tab) {
            System.out.println(element);
        }

        System.out.println(filterGreaterThan(tab, 2));

        ArrayList<Integer> filtered = (ArrayList<Integer>) filterGreaterThan(tab, 1);

        for (Integer element : filtered) {
            System.out.println(element);
        }
    }
}
