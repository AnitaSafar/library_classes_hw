import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(20);
        book = new Book("HP and the Philosopher's Stone", "J.K. Rowling", "Fiction");
    }

    @Test
    public void stockStartsAt0() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBooks() {
        library.addBookToStock(book);
        assertEquals(1, library.stockCount());
    }
}
