package administration;

import java.util.Arrays;

public class TestOfficial
{
    public static void main(String[] args) {
        Official test1 = new Official("John", new double[]{1.0, 2.0, 3.5, 4.6, 5.0});
        try {
            Official test2 = (Official) test1.clone();
            System.out.println("Przed zmianami:\n" + "Original: " + Arrays.toString(test1.serviceTimes));
            System.out.println("Clone: " + Arrays.toString(test2.serviceTimes));
            test1.changeTimeAtIndex(2, 99.9);
            System.out.println("Po zmianach:\n" + "Original: " + Arrays.toString(test1.serviceTimes));
            System.out.println("Clone: " + Arrays.toString(test2.serviceTimes));
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
