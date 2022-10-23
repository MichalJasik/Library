package pl.michaljasik.library.model;

public class Book extends Publication{
    private String author;
    private int page;
    private String isbn;


    public Book(String title, String author, int year, int page, String publisher, String isbn) {
        super(title,publisher, year);
        this.author = author;
        this.page = page;
        this.isbn = isbn;
    }

    @Override
    public void getInfo() {
        String info = getTitle() + "; " + author + "; " + getYear() + "; "
                + page + "; " + getPublisher();
        if (isbn != null) {
            info = info + " "+  isbn;
        }
        System.out.println(info);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
