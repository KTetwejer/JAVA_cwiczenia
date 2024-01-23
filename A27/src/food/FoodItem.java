package food;

public class FoodItem implements Comparable<FoodItem>
{
    private String name;
    private double weight;
    private double calories;

    public FoodItem(String name, double weight, double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                '}';
    }

    @Override
    public int compareTo(FoodItem o) {
        return Double.compare(this.calories, o.calories);
    }
}
