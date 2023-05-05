package pl.michaljasik.library.app;

import pl.michaljasik.library.exception.NoSuchOptionException;
import pl.michaljasik.library.io.ConsolePrinter;
import pl.michaljasik.library.io.DataReader;
import pl.michaljasik.library.model.Book;
import pl.michaljasik.library.model.Library;
import pl.michaljasik.library.model.Magazine;
import pl.michaljasik.library.model.Publication;

import java.util.InputMismatchException;

public class LibraryControl {

    private ConsolePrinter printer = new ConsolePrinter();
    private DataReader dataReader = new DataReader(printer);
    private Library library = new Library();

    public void loopControl() {
        Option option;
        do {
            printOptions();
            option = getOption();
            switch (option) {
                case ADDBOOK -> addBook();
                case PRINTBOOK -> printBooks();
                case ADDMAGAZINE -> addMagazine();
                case PRINTMAGAZINE -> printMagazine();
                case EXIT -> exit();
                default -> printer.printLine("Nie ma takiej opcji");
            }
        } while (option != Option.EXIT);
    }

    private Option getOption() {
        Option option = null;
        boolean optionOk = false;
        while (!optionOk){
            try{
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e){
                printer.printLine(e.getMessage());
            } catch (InputMismatchException e){
                printer.printLine("Wprowadzona wartosc nie jest liczba");
            }
        }
        return option;
    }

    private void printMagazine() {
        Publication[] publications = library.getPublications();
        printer.printMagazines(publications);
    }

    private void addMagazine() {
        try{
            Magazine magazine = dataReader.readAndCreateMagazie();
            library.addMagazine(magazine);
        } catch (InputMismatchException e){
            printer.printLine("Nie udało sie utworzyc magazynu!");
        } catch (ArrayIndexOutOfBoundsException e){
            printer.printLine("Osiagnieto limit pojemnosci!");
        }

    }

    private void exit() {
        printer.printLine("Do Widzenia!");
        dataReader.close();
    }

    private void printBooks() {
        Publication[] publications = library.getPublications();
        printer.printBooks(publications);
    }

    private void addBook() {
        try{
            Book book = dataReader.readAndCreateBook();
            library.addBook(book);
        } catch (InputMismatchException e){
            printer.printLine("Nie udało sie utworzyc ksiazki!");
        } catch (ArrayIndexOutOfBoundsException e){
            printer.printLine("Osiagnieto limit pojemnosci!");
        }

    }

    private void printOptions() {
        for (Option value : Option.values()) {
            printer.printLine(value.toString());
        }
    }
}
