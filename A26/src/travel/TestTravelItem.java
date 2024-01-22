package travel;

import java.util.Arrays;

public class TestTravelItem
{
    public static void main(String[] args) {
        TravelItem[] tab = new TravelItem[]{
                new TravelItem("1", 5.0, 1.1),
                new TravelItem("2", 2.7, 2.2),
                new TravelItem("3", 2.5, 3.3),
                new TravelItem("4", 0.5, 4.4)
        };
        System.out.println(Arrays.toString(tab));
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }
}
