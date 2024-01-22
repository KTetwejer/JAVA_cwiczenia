package aviation;

import java.util.Arrays;

public class TestPilot
{
    public static void main(String[] args) {
        Pilot p1 = new Pilot("John", new double[]{1.0, 2.0, 3.0});
        try {
            Pilot p2 = (Pilot) p1.clone();
            System.out.println(Arrays.toString(p1.getFlightHours()));
            System.out.println(Arrays.toString(p2.getFlightHours()));
            p1.setFlightHoursAtIndex(0, 7.7);
            System.out.println(Arrays.toString(p1.getFlightHours()));
            System.out.println(Arrays.toString(p2.getFlightHours()));
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
