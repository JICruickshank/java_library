import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("Harry Potter", BookType.FANTASY);
    }

    @Test
    public void libraryHasNoBooks() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getBookCount());
        }

    @Test
    public void libraryHasSpace() {
        assertTrue(library.hasSpace());
    }

    @Test
    public void hasNoSpace() {
        library.addBook(book);
        library.addBook(book);
        assertFalse(library.hasSpace());
    }

    @Test
    public void doesNotAddBookWhenFull() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.addBook(book);
        library.removeBook(book);
        assertEquals(1, library.getBookCount());
    }



}
