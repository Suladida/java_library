import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book();
        book2 = new Book();
        book3 = new Book();
        book4 = new Book();
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBookToStock(){
        library.addBookToStock(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void cantAddBookToStock(){
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.addBookToStock(book3);
        library.addBookToStock(book4);
        assertEquals(3, library.stockCount());
    }

    @Test
    public void canRemoveBookFromStock(){
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.removeBookFromStock(book1);
        assertEquals(1, library.stockCount());
    }



}
