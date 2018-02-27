import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> books;

    public Borrower(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getBorrowerName() {
        return this.name;
    }

    public int borrowerBookCount() {
        return this.books.size();
    }

    public void giveBorrowerBook(Book book) {
        this.books.add(book);
    }

    public void borrowBook(Book book, Library library) {
        Book bookToBorrow = library.removeBook(book);
        this.giveBorrowerBook(bookToBorrow);
    }
}
