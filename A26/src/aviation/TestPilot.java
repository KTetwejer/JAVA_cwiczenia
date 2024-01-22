package aviation;

import java.util.ArrayList;

public class TestPilot
{
    public static void main(String[] args) {
        ArrayList<Double> fh = new ArrayList<>();
        fh.add(3.5);
        fh.add(5.0);
        fh.add(2.5);

        Pilot p1 = new Pilot("Pilot", fh);

        try {
            Pilot p2 = (Pilot) p1.clone();
            p1.setFlightHoursAtIndex(2, 77.7);
            System.out.println("Original pilot: " + p1.getFlightHours());
            System.out.println("Cloned pilot: " + p2.getFlightHours());
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
