import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBook;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBook = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int borrowedBookCount() {
        return this.borrowedBook.size();
    }

    public void increaseBorrowed(Book book) {
        this.borrowedBook.add(book);
    }
}
