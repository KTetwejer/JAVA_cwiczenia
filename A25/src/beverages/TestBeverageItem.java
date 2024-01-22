package beverages;

import java.util.ArrayList;
import java.util.Collections;

public class TestBeverageItem
{
    public static void main(String[] args) {
        ArrayList<BeverageItem> tab = new ArrayList<>();
        tab.add(new BeverageItem("1", 2.0, 4.1));
        tab.add(new BeverageItem("2", 2.0, 5.0));
        tab.add(new BeverageItem("3", 2.0, 4.0));
        tab.add(new BeverageItem("4", 2.0, 2.3));
        tab.forEach(System.out::println);

        System.out.println("Sorted:");
        Collections.sort(tab);
        tab.stream().forEach(System.out::println);
    }
}
