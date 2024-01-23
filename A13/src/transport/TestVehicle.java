package transport;

import java.util.Arrays;

public class TestVehicle
{
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("ModelA", "Car", 500),
                new Vehicle("ModelB", "Motorcycle", 300),
                new Vehicle("ModelC", "Car", 500),
                new Vehicle("ModelD", "Motorcycle", 400),
                new Vehicle("ModelE", "Car", 500)
        };

        Arrays.sort(vehicles, new RangeComparator().thenComparing(new TypeModelComparator()));

        System.out.println("Posortowana lista pojazdów:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("Model: " + vehicle.getModel() +
                    ", Typ: " + vehicle.getType() +
                    ", Zasięg: " + vehicle.getRange() + " km");
        }
    }
}