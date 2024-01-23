package service;

import java.util.Comparator;

public class ServiceProvider implements Comparator<ServiceProvider>
{
    private int id;
    private String name;
    private double experienceLevel;

    public ServiceProvider(int id, String name, double experienceLevel) {
        this.id = id;
        this.name = name;
        this.experienceLevel = experienceLevel;
    }

    public ServiceProvider() {
    }

    public String getName() {
        return name;
    }

    public double getExperienceLevel() {
        return experienceLevel;
    }

    @Override
    public int compare(ServiceProvider o1, ServiceProvider o2) {
        int experienceComparison = Double.compare(o2.experienceLevel, o1.experienceLevel);
        if (experienceComparison == 0) {
            return o1.name.compareTo(o2.name);
        }
        return experienceComparison;
    }
}
