import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.books.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean hasSpace() {
        return this.books.size() < this.capacity;
    }

    public void addBook(Book book) {
        if (hasSpace()) {
            this.books.add(book);}
    }

    public Book removeBook(Book book) {
        int indexToRemove = this.books.indexOf(book);
        return this.books.remove(indexToRemove);
    }



}
