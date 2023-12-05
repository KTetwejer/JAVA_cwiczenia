package moto;

public class TestVehicle
{
    public static void main(String[] args)
    {
        Vehicle c1 = Vehicle.CreateCar("Opel", "Astra", 1998);
        System.out.println(c1.toString());

        Vehicle c2 = new Vehicle();
        Vehicle c3 = c2.CreateVehicle("Toyota", "Supra", 2023);
        System.out.println(c3.toString());
    }
}
