package pl.michaljasik.library.io;

import pl.michaljasik.library.model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public Book readAndCreate() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int realiseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Liczba stron: ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, autor, realiseDate, pages, publisher, isbn);
    }

    public void close() {
        sc.close();
    }
}
