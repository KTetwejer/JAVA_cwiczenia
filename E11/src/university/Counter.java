package university;

import java.util.Iterator;

public class Counter {
    public static <T> int countElements(Iterator<T> items, T element) {
        int count = 0;
        while(items.hasNext()) {
            if(items.next().equals(element)) {
                count++;
            }
        }
        return count;
    }
}