package pl.michaljasik.library.app;

import pl.michaljasik.library.io.DataReader;
import pl.michaljasik.library.model.Book;
import pl.michaljasik.library.model.Library;

public class LibraryControl {
    private final int exit = 0;
    private final int addBook = 1;
    private final int printBook = 2;
    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void loopControl() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBook -> addBook();
                case printBook -> printBooks();
                case exit -> exit();
                default -> System.out.println("Nie ma takiej opcji");
            }
        } while (option != exit);
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
        System.out.println(exit + " Wyjscie z programu");
        System.out.println(addBook + " Dodanie nowej ksiazki");
        System.out.println(printBook + " Wyswietlenie dostepnych ksiazek");
    }
}
