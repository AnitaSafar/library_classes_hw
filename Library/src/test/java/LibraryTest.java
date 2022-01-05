import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("HP and the Philosopher's Stone", "J.K. Rowling", "Fiction");
        book2 = new Book("HP and the Chamber of Secrets", "J.K. Rowling", "Fiction");
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

    @Test
    public void canNotAddBooks() {
        library.addBookToStock(book);
        library.addBookToStock(book2);
        library.addBookToStock(book2);
        assertEquals(2, library.stockCount());
    }

}
