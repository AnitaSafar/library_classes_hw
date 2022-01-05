import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Da Vinci Code", "Dan Brown", "Crime");
    }

    @Test
    public void hasTitle() {
        assertEquals("Da Vinci Code", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Dan Brown", book.getAuthor());
    }

}
