public class Book{
    public String title;
    public String genre;
    public int numberOfPages;

    public Book(String title, String genre, int numberOfPages){
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    @Override
    public String toString()
    {
        return "Title: " + this.title + " Genre: " + this.genre + " Pages: " + this.numberOfPages;
    }
}