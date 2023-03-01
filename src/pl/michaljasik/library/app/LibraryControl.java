package pl.michaljasik.library.app;

import pl.michaljasik.library.io.DataReader;
import pl.michaljasik.library.model.Book;
import pl.michaljasik.library.model.Library;
import pl.michaljasik.library.model.Magazine;

public class LibraryControl {
    private static final int EXIT = 0;
    private static final int ADDBOOK = 1;
    private static final int ADDMAGAZINE = 2;
    private static final int PRINTBOOK = 3;
    private static final int PRINTMAGAZINE = 4;
    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void loopControl() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case ADDBOOK -> addBook();
                case PRINTBOOK -> printBooks();
                case ADDMAGAZINE -> addMagazine();
                case PRINTMAGAZINE -> printMagazine();
                case EXIT -> exit();
                default -> System.out.println("Nie ma takiej opcji");
            }
        } while (option != EXIT);
    }

    private void printMagazine() {
        library.printMagazine();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazie();
        library.addMagazine(magazine);
    }

    private void exit() {
        System.out.println("Do Widzenia!");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("\nWybierz Opcje: ");
        System.out.println(EXIT + " Wyjscie z programu");
        System.out.println(ADDBOOK + " Dodanie nowej ksiazki");
        System.out.println(ADDMAGAZINE + " Dodanie nowego magazynu");
        System.out.println(PRINTBOOK + " Wyswietlenie dostepnych ksiazek");
        System.out.println(PRINTMAGAZINE + " Wyswietlenie dostepnych magazynow");
    }
}
