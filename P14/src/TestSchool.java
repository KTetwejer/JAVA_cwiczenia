import education.School;

public class TestSchool
{
    public static void main(String[] args)
    {
        School s1 = new School("WMII", "", 50);
        School s2 = new School("wmii", "Ul. Sloneczna 54, 10-710 Olsztyn", 0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        s1.recruitment(475);
        System.out.println(s1);

    }

}
