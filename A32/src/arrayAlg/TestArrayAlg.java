package arrayAlg;

public class TestArrayAlg
{
    public static <T extends Comparable<T>> int findMinIndex(T[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Tablica jest pusta lub równa null");
        }
        int minIndex = 0;
        T minValue = tab[0];
        for(int i = 1; i < tab.length; i++) {
            if (tab[i].compareTo(minValue) < 0) {
                minIndex = i;
                minValue = tab[i];
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        Book[] books = {
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960),
                new Book("1984", "George Orwell", 1949),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951)
        };

        int minIndex = findMinIndex(books);

        System.out.println("Book with earliest publication: " + books[minIndex].getTitle() +
                " by " + books[minIndex].getAuthor() +
                ", published in " + books[minIndex].getYearPublished());
    }
}
