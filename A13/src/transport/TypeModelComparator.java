package transport;

import java.util.Comparator;

public class TypeModelComparator implements Comparator<Vehicle>
{
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        int typeComparison = o1.getType().compareTo(o2.getType());
        if (typeComparison == 0) {
            return o1.getModel().compareTo(o2.getModel());
        }
        return typeComparison;
    }
}
