package transport;

import java.util.ArrayList;

public class TestBusDepot
{
    public static void main(String[] args) {
        ArrayList<String> listOfBuses = new ArrayList<>();
        ArrayList<String> listOfBuses2 = new ArrayList<>();
        BusDepot b1 = new BusDepot("Zajezdnia1", "Olsztyn");
        CityBusDepot b2 = new CityBusDepot("Zajezdnia2", "Warszawa", 3);

        b1.addBus("1234");
        b1.addBus("5678");
        b1.removeBus("1234");
        System.out.println("Informacje o b1:");
        System.out.println(b1);
    }
}

