package pl.michaljasik.library.app;

import pl.michaljasik.library.io.DataReader;
import pl.michaljasik.library.model.Book;
import pl.michaljasik.library.model.Library;
import pl.michaljasik.library.model.Magazine;

public class LibraryControl {

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void loopControl() {
        Option option;

        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());
            switch (option) {
                case ADDBOOK -> addBook();
                case PRINTBOOK -> printBooks();
                case ADDMAGAZINE -> addMagazine();
                case PRINTMAGAZINE -> printMagazine();
                case EXIT -> exit();
                default -> System.out.println("Nie ma takiej opcji");
            }
        } while (option != Option.EXIT);
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
        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }
}
