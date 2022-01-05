import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;

    @Before
    public void before() {
        library = new Library(20);
    }

    @Test
    public void stockStartsAt0() {
        assertEquals(0, library.stockCount());
    }
}
