package aviation;

import java.util.Arrays;

public class Pilot implements Cloneable
{
    private String name;
    private double[] flightHours;

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        this.flightHours = flightHours;
    }

    public void setFlightHoursAtIndex(int index, double value) {
        if (index >= 0 && index < this.flightHours.length) {
            this.flightHours[index] = value;
        }
        else {
            System.out.println("Incorrect index");
        }
    }

    public double[] getFlightHours() {
        return flightHours;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pilot clone = (Pilot) super.clone();
        clone.flightHours = Arrays.copyOf(this.flightHours, this.flightHours.length);
        return clone;
    }
}
