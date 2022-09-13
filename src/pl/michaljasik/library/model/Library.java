package pl.michaljasik.library.model;

public class Library {
    private static final int MAX_BOOKS =1000;
    private static final int MAX_MAGAZINE =1000;
    private Book[] books = new Book[MAX_BOOKS];
    private Magazine[] magazines = new Magazine[MAX_MAGAZINE];
    private int currentIndexBook = 0;
    private int currentIndexMagazine = 0;


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

    public void addMagazine(Magazine magazine){
        if(currentIndexMagazine< MAX_MAGAZINE){ //sprawdzenie miejsca w tablicy
            magazines[currentIndexMagazine] = magazine;
            currentIndexMagazine++;
        }else{
            System.out.println("Wiecej magazynow do bibloteki dodac nie mozna!");
        }
    }

    public void printMagazine(){
        if (currentIndexMagazine == 0) {
            System.out.println("Brak magazynow do wyswietlenia: ");
        }
        for (int i = 0; i < currentIndexMagazine; i++) {
            magazines[i].printInfo();
        }
    }
}
