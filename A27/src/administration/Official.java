package administration;

import java.util.Arrays;

public class Official implements Cloneable
{
    private String name;
    double[] serviceTimes;

    public Official(String name, double[] serviceTimes) {
        this.name = name;
        if(serviceTimes.length != 5) {
            System.out.println("Tablica powinna zawierać 5 elementów!");
        }
        else {
            this.serviceTimes = serviceTimes;
        }
    }

    public double[] getServiceTimes() {
        return serviceTimes;
    }

    public void changeTimeAtIndex(int index, double value) {
        if(index < 0 || index > this.serviceTimes.length) {
            System.out.println("Błędny indeks");
        }
        else {
            this.serviceTimes[index] = value;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Official clone = (Official) super.clone();
        clone.serviceTimes = Arrays.copyOf(this.serviceTimes, serviceTimes.length);
        return clone;
    }
}
