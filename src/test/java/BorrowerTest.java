import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;
    Book book2;

    @Before
    public void before() {
        borrower = new Borrower("J");
        book = new Book("Harry Potter", BookType.FANTASY);
        library = new Library(2);
        book2 = new Book("Day of The Jackal", BookType.THRILLER);
    }

    @Test
    public void borrowerHasName() {
        assertEquals("J", borrower.getBorrowerName());
    }

    @Test
    public void borrowerHasNoBooks() {
        assertEquals(0, borrower.borrowerBookCount());
    }

    @Test
    public void canGiveBorrowerBook() {
        borrower.giveBorrowerBook(book);
        assertEquals(1, borrower.borrowerBookCount());
    }

    @Test
    public void canBorrowBook() {
        library.addBook(book);
        library.addBook(book2);
        borrower.borrowBook(book2, library);
        assertEquals(1, borrower.borrowerBookCount());
        assertEquals(1, library.getBookCount());
    }

}
