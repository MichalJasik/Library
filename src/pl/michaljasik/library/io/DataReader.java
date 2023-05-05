package pl.michaljasik.library.io;

import pl.michaljasik.library.model.Book;
import pl.michaljasik.library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public Book readAndCreateBook() {
        printer.printLine("Tytuł: ");
        String title = sc.nextLine();
        printer.printLine("Autor: ");
        String autor = sc.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = sc.nextLine();
        printer.printLine("ISBN: ");
        String isbn = sc.nextLine();
        printer.printLine("Rok wydania: ");
        int realiseDate = sc.nextInt();
        sc.nextLine();
        printer.printLine("Liczba stron: ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, autor, realiseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazie() {
        printer.printLine("Tytuł: ");
        String title = sc.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = sc.nextLine();
        printer.printLine("Jezyk: ");
        String language = sc.nextLine();
        printer.printLine("rok: ");
        int year = sc.nextInt();
        printer.printLine("miesiac: ");
        int month = sc.nextInt();
        printer.printLine("dzien: ");
        int day = sc.nextInt();
        sc.nextLine();

        return new Magazine(title,publisher,language, year, month,day);
    }

    public void close() {
        sc.close();
    }

    // Jak ktos poda liczbe, zostanie ona zwrocona, a w bloku finally pozbywamy sie entera
    // jeśli ktoś poda napis zamiast liczby zostanie rzucony wyjatek, blok finnaly i tak sie wykona
    // a wyjatek bedziemy mogli przechwycic w miejscu gdzie sie metoda wywolala
    public int getInt() {
        try{
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }


    }
}
