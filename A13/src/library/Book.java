package library;

public record Book(String title, String author, int pageCount)
{
    public Book {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Liczba stron musi być większa od 0.");
        }
    }

    public boolean isLongBook() {
        return this.pageCount > 300;
    }

    public String printDetails() {
        return "Tytuł: " + this.title + ", autor: " + this.author + ", liczba stron: " + this.pageCount;
    }
}
