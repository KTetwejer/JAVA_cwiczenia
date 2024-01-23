package sports;

import java.util.Arrays;

public class BasketballPlayer implements Cloneable
{
    private String name;
    private int[] points;

    public BasketballPlayer(String name, int[] points) {
        this.name = name;

        if (points.length != 5) {
            System.out.println("Tablica points musi zawierać 5 elementów.");
        }
        else {
            this.points = points;
        }
    }

    public void setPointsAtIndex(int index, int value) {
        if (index >= 0 && index < this.points.length) {
            this.points[index] = value;
        }
        else {
            System.out.println("Incorrect index");
        }
    }

    public int[] getPoints() {
        return points;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BasketballPlayer clone = (BasketballPlayer) super.clone();
        clone.points = Arrays.copyOf(this.points, points.length);
        return clone;
    }
}
