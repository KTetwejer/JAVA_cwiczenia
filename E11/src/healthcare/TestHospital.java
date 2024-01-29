package healthcare;

public class TestHospital
{
    public static void main(String[] args) {
        Hospital h1 = new Hospital("x1", 10.0);
        Hospital h2 = new Hospital("x1", 10.0);
        Hospital h3 = new Hospital("x2", -10.0);
        Clinic c1 = new Clinic("y1", 40.0, 3.5);
        Clinic c2 = new Clinic("y1", 40.0, 3.5);

        System.out.println(h1.equals(h2)); //true
        System.out.println(h1.equals(c1)); //false
        System.out.println(h2.equals(h3)); //false
        System.out.println(c1.equals(c2)); //true
        System.out.println(h3.equals(h1)); //false
    }
}
