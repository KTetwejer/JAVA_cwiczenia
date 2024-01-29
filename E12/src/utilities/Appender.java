package utilities;

import java.util.ArrayList;

public class Appender
{
    public static <E> void appendFromEnd(ArrayList<? super E> source, ArrayList<? extends E> destination) {
        source.addAll(destination);
    }
}
