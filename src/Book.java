public class Book {
    String title;
    String author;
    int realiseDate;
    int page;
    String publisher;
    String isbn;

    public Book(String title, String author, int realiseDate, int page, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.realiseDate = realiseDate;
        this.page = page;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    void getInfo(){
        String info = title + "; " + author + "; " + realiseDate + "; "
                + page + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}
