package library;

public class TestBook
{
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 300);
        Book b2 = new Book("Umysł zabójcy", "Mike Omer", 400);

        System.out.println(b1.isLongBook() + "\n" + b1.printDetails());
        System.out.println(b2.isLongBook() + "\n" + b2.printDetails());
    }
}
