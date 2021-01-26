import java.util.ArrayList;

public class BookWorm {

    private ArrayList<Book> favourites;

    public BookWorm(){
        this.favourites = new ArrayList<Book>();
    }

    public int favouritesCount(){
        return favourites.size();
    }

    public void addBookToFavourites(Book book) {
        favourites.add(book);
    }
}
