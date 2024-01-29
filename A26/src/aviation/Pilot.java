package aviation;

import java.util.ArrayList;

public class Pilot implements Cloneable
{
    private String name;
    private ArrayList<Double> flightHours;

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = flightHours.clone();
    }

    public void setFlightHoursAtIndex(int index, double newHour) {
        if (index >= 0 && index < flightHours.size())
        {
            flightHours.set(index, newHour);
        }
        else
        {
            System.out.println("Invalid index");
        }
    }

    public ArrayList<Double> getFlightHours() {
        return flightHours;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pilot clonedPilot = (Pilot) super.clone();
        clonedPilot.flightHours = new ArrayList<>(this.flightHours);
        return clonedPilot;
    }
}
