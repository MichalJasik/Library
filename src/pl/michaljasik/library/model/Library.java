package pl.michaljasik.library.model;

public class Library {
    private static final int MAX_BOOKS =1000;
    private Book[] books = new Book[MAX_BOOKS];
    private int currentIndexBook = 0;

    public void addBook(Book book){
        if(currentIndexBook< MAX_BOOKS){ //sprawdzenie miejsca w tablicy
            books[currentIndexBook] = book;
            currentIndexBook++;
        }else{
            System.out.println("Wiecej ksiazek do bibloteki dodac nie mozna!");
        }
    }

    public void printBooks(){
        if (currentIndexBook == 0) {
            System.out.println("Brak ksiazek do wyswietlenia: ");
        }
        for (int i = 0; i < currentIndexBook; i++) {
            books[i].getInfo();
        }
    }
}
