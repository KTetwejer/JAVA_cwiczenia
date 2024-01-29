package sports;

import java.util.Arrays;

public class TestAthlete
{
    public static void main(String[] args) {
        Athlete[] arr = new Athlete[4];
        arr[0] = new Athlete("Bolt", "Jamaica", new double[]{9.58, 19.19});
        arr[1] = new Athlete("Gatlin", "USA", new double[]{9.74, 19.57});
        arr[2] = new Athlete("Blake", "Jamaica", new double[]{9.69, 19.26});
        arr[3] = new Athlete("Bolt", "-", new double[]{9.58, 19.19});
        System.out.println("Before sorting:");
        for (Athlete athlete : arr) {
            System.out.println(athlete);
        }
        Arrays.sort(arr, new RecordComparator().thenComparing(new NationalityNameComparator()));
        System.out.println("After sorting:");
        for (Athlete athlete : arr) {
            System.out.println(athlete);
        }
    }
}
