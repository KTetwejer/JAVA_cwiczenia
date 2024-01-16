package healthcare;

public class TestHospital
{
    public static void main(String[] args) {
        Hospital h1 = new Hospital("xyz", 35.0);
        System.out.println(h1.toString());

        Hospital h2 = h1.clone();
        System.out.println(h2.toString());

        h1.setName("xxxx");
        System.out.println(h1.toString());

    }
}
