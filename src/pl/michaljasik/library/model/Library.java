package pl.michaljasik.library.model;

public class Library {
    private static final int MAX_PUBLICATIONS =1000;
    private int publicationsIndexNumber = 0;
    private  Publication[] publications = new Publication[MAX_PUBLICATIONS];


    public void addBook(Book book){
        addPublication(book);
    }

    public void addMagazine(Magazine magazine){
        addPublication(magazine);
    }

    private void addPublication(Publication publication){
        if (publicationsIndexNumber>=MAX_PUBLICATIONS){
            throw new ArrayIndexOutOfBoundsException("Max publication exit" + MAX_PUBLICATIONS);
        }
        publications[publicationsIndexNumber] = publication;
        publicationsIndexNumber++;
    }

    public Publication[] getPublications() {
        Publication result[] = new Publication[publicationsIndexNumber];
        for (int i = 0; i < result.length; i++) {
            result[i] = publications[i];
        }
        return result;
    }
}
