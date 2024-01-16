package healthcare;

public class Hospital implements Cloneable
{
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = (name == null || name.isEmpty()) ? "" : name;
        this.capacity = (capacity < 0) ? 50.0 : capacity;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Hospital clone() {
        try {
            return (Hospital) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
