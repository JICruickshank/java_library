import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book("Harry Potter", BookType.FANTASY);
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Harry Potter", book.getBookTitle());
    }

    @Test
    public void bookHasType() {
        assertEquals("Pish", book.getBookTypeDescription());
    }
}
