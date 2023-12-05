package moto;

public class Vehicle
{
    public String brand;
    public String model;
    public int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public static Vehicle CreateCar(String brand, String model, int year)
    {
        return new Vehicle(brand, model, year);
    }

    public Vehicle()
    {}

    public Vehicle CreateVehicle(String brand, String model, int year)
    {
        return new Vehicle(brand, model, year);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
