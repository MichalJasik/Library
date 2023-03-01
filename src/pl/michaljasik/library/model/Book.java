package pl.michaljasik.library.model;

import java.util.Objects;

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
    public String toString() {
        return super.toString() + "; " + author + "; " + page + "; " + isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, page, isbn);
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
