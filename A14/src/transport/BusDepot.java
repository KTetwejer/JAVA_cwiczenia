package transport;

import java.util.ArrayList;
import java.util.Objects;

public class BusDepot
{
    private String name;
    private String city;
    private ArrayList<String> buses;

    public void addBus(String busNumber){
        buses.add(busNumber);
    }

    public void removeBus(String busNumber) {
        buses.remove(busNumber);
    }

    public BusDepot(String name, String city) {
        this.name = name;
        this.city = city;
        this.buses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getBuses() {
        return new ArrayList<>(buses);
    }

    public void setBuses(ArrayList<String> buses) {
        this.buses = buses;
    }

    @Override
    public String toString() {
        return "BusDepot{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", buses=" + buses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusDepot busDepot = (BusDepot) o;
        return Objects.equals(name, busDepot.name) && Objects.equals(city, busDepot.city) && Objects.equals(buses, busDepot.buses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, buses);
    }
}
