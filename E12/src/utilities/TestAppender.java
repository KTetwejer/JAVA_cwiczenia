package utilities;

import java.util.ArrayList;

public class TestAppender {
    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<Integer>();
        ArrayList<Integer> destination = new ArrayList<Integer>();
        source.add(1);
        source.add(2);
        source.add(3);
        destination.add(4);
        destination.add(5);
        destination.add(6);
        Appender.appendFromEnd(source, destination);
        System.out.println(source);
        System.out.println(destination);
    }
}