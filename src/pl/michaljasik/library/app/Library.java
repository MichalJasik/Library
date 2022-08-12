package pl.michaljasik.library.app;

import pl.michaljasik.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String  appName= "Version 0.6 ";

        Book b1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,
                296, "Greg", "9788373271890");
        Book b2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch",
                2009, 352, "Helion", "9788324620845");
        Book b3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851,
                "McGraw-Hill Osborne Media");

        b1.getInfo();
        b2.getInfo();
        b3.getInfo();
    }
}
