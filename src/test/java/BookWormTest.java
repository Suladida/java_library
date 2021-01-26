import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookWormTest {

    private Library library;
    private Book book1;
    private Book book2;
    private BookWorm bookWorm;



    @Before
    public void before(){
        bookWorm = new BookWorm();
        library = new Library();
        book1 = new Book();
        book2 = new Book();
    }

    @Test
    public void favouritesStartEmpty(){
        assertEquals(0, bookWorm.favouritesCount());
    }

    @Test
    public void canAddBookToFavourites(){
        bookWorm.addBookToFavourites(book1);
        assertEquals(1, bookWorm.favouritesCount());
    }




}
