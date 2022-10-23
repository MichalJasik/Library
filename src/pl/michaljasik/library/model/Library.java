package pl.michaljasik.library.model;

public class Library {
    private static final int MAX_PUBLICATIONS =1000;
    private int publicationsIndexNumber = 0;
    private  Publication[] publications = new Publication[MAX_PUBLICATIONS];


    public void addBook(Book book){
        if(publicationsIndexNumber< MAX_PUBLICATIONS){ //sprawdzenie miejsca w tablicy
            publications[publicationsIndexNumber] = book;
            publicationsIndexNumber++;
        }else{
            System.out.println("Wiecej ksiazek do bibloteki dodac nie mozna!");
        }
    }


    public void printBooks(){
        int countBooks = 0;
        for (int i = 0; i < publicationsIndexNumber; i++) {
            if (publications[i] instanceof Book) {
                publications[i].getInfo();
                countBooks++;
            }

        }
        if (countBooks == 0) {
            System.out.println("Brak ksiazek do wyswietlenia: ");
        }
    }

    public void addMagazine(Magazine magazine){
        if(publicationsIndexNumber< MAX_PUBLICATIONS){ //sprawdzenie miejsca w tablicy
            publications[publicationsIndexNumber] = magazine;
            publicationsIndexNumber++;
        }else{
            System.out.println("Wiecej magazynow do bibloteki dodac nie mozna!");
        }
    }

    public void printMagazine(){
        int countMagazine=0;
        for (int i = 0; i < publicationsIndexNumber; i++) {
            if (publications[i] instanceof Magazine){
                publications[i].getInfo();
                countMagazine++;
            }
        }
        if (countMagazine == 0) {
            System.out.println("Brak magazynow do wyswietlenia: ");
        }
    }
}
