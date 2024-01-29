package sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete>
{

    @Override
    public int compare(Athlete o1, Athlete o2) {
        int v = o2.getNationality().compareTo(o1.getNationality());
        if (v == 0) {
            return o2.getName().compareTo(o1.getName());
        }
        else {
            return v;
        }
    }
}
