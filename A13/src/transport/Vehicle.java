package transport;

public class Vehicle
{
    private String model;
    private String type;
    private int range;

    public Vehicle(String model, String type, int range) {
        this.model = model;
        this.type = type;
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }
}
