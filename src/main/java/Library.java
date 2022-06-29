import java.util.ArrayList;

public class Library{

    public ArrayList<Book> libraryBooks;

    public Library(){
        this.libraryBooks = new ArrayList<>();
    }
    
    public void add(Book book)
    {
        this.libraryBooks.add(book);
    }
    public Book getBook(int index)
    {
        return libraryBooks.get(index);
    }
}