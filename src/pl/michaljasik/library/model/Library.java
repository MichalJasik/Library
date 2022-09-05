package pl.michaljasik.library.model;

public class Library {
    private final int maxBooks =1000;
    private Book[] books = new Book[maxBooks];
    private int currentIndexBook = 0;

    public void addBook(Book book){
        if(currentIndexBook<maxBooks){ //sprawdzenie miejsca w tablicy
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
