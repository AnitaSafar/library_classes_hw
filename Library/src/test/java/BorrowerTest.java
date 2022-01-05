import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower("Karen");
        book = new Book("Angels and Demons", "Dan Brown", "Crime");
    }

    @Test
    public void hasName() {
        assertEquals("Karen", borrower.getName());
    }

    @Test
    public void canBorrow() {
        assertEquals(0, borrower.borrowedBookCount());
    }

    @Test
    public void canIncreaseBorrowedBookCount() {
        borrower.increaseBorrowed(book);
        assertEquals(1, borrower.borrowedBookCount());
    }
}
