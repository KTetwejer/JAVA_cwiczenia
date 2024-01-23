package transport;

import java.util.ArrayList;
import java.util.Objects;

public class CityBusDepot extends BusDepot
{
    private int numberOfRoutes;
    public CityBusDepot(String name, String city, int numberOfRoutes) {
        super(name, city);
        this.numberOfRoutes = numberOfRoutes;
    }

    public int getNumberOfRoutes() {
        return numberOfRoutes;
    }

    public void setNumberOfRoutes(int numberOfRoutes) {
        this.numberOfRoutes = numberOfRoutes;
    }

    @Override
    public String toString() {
        return "CityBusDepot{" +
                "numberOfRoutes=" + numberOfRoutes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CityBusDepot that = (CityBusDepot) o;
        return numberOfRoutes == that.numberOfRoutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfRoutes);
    }
}
