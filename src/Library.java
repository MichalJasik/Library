public class Library {
    public static void main(String[] args) {
        final String appName = "Bibloteka v0.1";
        Book b1 = new Book();

        b1.author = "Henryk Sienkiwicz";
        b1.title = "W pustyni i w puszczy";
        b1.page = 200;
        b1.publisher = "Greg";
        b1.isbn = "17273971";

        String b1info = "Autor: " + b1.author +
                "\tTytuł: " + b1.title +
                "\tStron: " + b1.page +
                "\tPublikacja: " + b1.publisher +
                "\tisbn: " + b1.isbn;

        System.out.println(b1info);
    }
}
