import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library() {
        this.stock = new ArrayList<Book>();
        this.capacity = 3;
    }

    public int stockCount() {
        return stock.size();
    }

    public void addBookToStock(Book book) {
        if (stockCount() < this.capacity) {
            stock.add(book);
        }
    }

    public void removeBookFromStock(Book book) {
        this.stock.remove(book);
    }
}
