package service;

import java.util.ArrayList;
import java.util.Collections;

public class TestServiceProvider
{
    public static void main(String[] args) {
        ArrayList<ServiceProvider> providers = new ArrayList<>();
        providers.add(new ServiceProvider(1, "John", 5.7));
        providers.add(new ServiceProvider(2, "Alice", 4.2));
        providers.add(new ServiceProvider(3, "Bob", 5.7));
        providers.add(new ServiceProvider(4, "Eve", 3.8));
        providers.add(new ServiceProvider(5, "Charlie", 4.5));

        Collections.sort(providers, new ServiceProvider());

        System.out.println("Posortowana lista (Comparator):");
        for (ServiceProvider provider : providers) {
            System.out.println(provider.getName() + " - Experience: " + provider.getExperienceLevel());
        }
    }
}
