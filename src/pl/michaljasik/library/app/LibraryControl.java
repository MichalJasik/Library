package pl.michaljasik.library.app;

import pl.michaljasik.library.io.DataReader;
import pl.michaljasik.library.model.Book;
import pl.michaljasik.library.model.Library;

public class LibraryControl {
    private static final int EXIT = 0;
    private static final int ADDBOOK = 1;
    private static final int PRINTBOOK = 2;
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
                case EXIT -> exit();
                default -> System.out.println("Nie ma takiej opcji");
            }
        } while (option != EXIT);
    }

    private void exit() {
        System.out.println("Do Widzenia!");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreate();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz Opcje: ");
        System.out.println(EXIT + " Wyjscie z programu");
        System.out.println(ADDBOOK + " Dodanie nowej ksiazki");
        System.out.println(PRINTBOOK + " Wyswietlenie dostepnych ksiazek");
    }
}
