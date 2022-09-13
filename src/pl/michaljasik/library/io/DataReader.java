package pl.michaljasik.library.io;

import pl.michaljasik.library.model.Book;
import pl.michaljasik.library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public Book readAndCreateBook() {
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

    public Magazine readAndCreateMagazie() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("Jezyk: ");
        String language = sc.nextLine();
        System.out.println("rok: ");
        int year = sc.nextInt();
        System.out.println("miesiac: ");
        int month = sc.nextInt();
        System.out.println("dzien: ");
        int day = sc.nextInt();
        sc.nextLine();

        return new Magazine(title,publisher,language, year, month,day);
    }

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
}
