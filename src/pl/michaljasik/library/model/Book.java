package pl.michaljasik.library.model;

public class Book {
    private String title;
    private String author;
    private int realiseDate;
    private int page;
    private String publisher;
    private String isbn;
    public Book(String title, String author, int realiseDate, int page, String publisher, String isbn) {
        this( title, author, realiseDate, page, publisher);
        this.isbn = isbn;
    }

    public Book(String title, String author, int realiseDate, int page, String publisher){
        this.title = title;
        this.author = author;
        this.realiseDate = realiseDate;
        this.page = page;
        this.publisher = publisher;
    }

    public void getInfo(){
        String info = title + "; " + author + "; " + realiseDate + "; "
                + page + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRealiseDate() {
        return realiseDate;
    }

    public void setRealiseDate(int realiseDate) {
        this.realiseDate = realiseDate;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
