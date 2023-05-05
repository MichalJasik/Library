package pl.michaljasik.library.io;

import pl.michaljasik.library.model.Book;
import pl.michaljasik.library.model.Magazine;
import pl.michaljasik.library.model.Publication;

public class ConsolePrinter {
    public void printBooks(Publication[] publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Book) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak książek w bibliotece");
    }

    public void printMagazines(Publication[] publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Magazine) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak magazynów w bibliotece");
    }

    public void printLine(String text){
        System.out.println(text.toUpperCase());
    }
}
