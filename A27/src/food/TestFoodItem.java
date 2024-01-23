package food;

import java.util.ArrayList;
import java.util.Collections;

public class TestFoodItem
{
    public static void main(String[] args) {
        ArrayList<FoodItem> tab = new ArrayList<>();
        tab.add(new FoodItem("a", 1.0, 35.7));
        tab.add(new FoodItem("b", 2.0, 19.9));
        tab.add(new FoodItem("c", 3.0, 10.5));
        tab.add(new FoodItem("d", 4.0, 17.8));
        tab.forEach(System.out::println);
        Collections.sort(tab);
        tab.forEach(System.out::println);
    }
}
