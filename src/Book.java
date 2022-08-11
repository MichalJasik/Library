public class Book {
    String title;
    String author;
    int realiseDate;
    int page;
    String publisher;
    String isbn;
    public Book(String title, String author, int realiseDate, int page, String publisher, String isbn) {
        this( title, author, realiseDate, page, publisher);
        this.isbn = isbn;
    }

    Book(String title, String author, int realiseDate, int page, String publisher){
        this.title = title;
        this.author = author;
        this.realiseDate = realiseDate;
        this.page = page;
        this.publisher = publisher;
    }

    void getInfo(){
        String info = title + "; " + author + "; " + realiseDate + "; "
                + page + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}
