package pl.michaljasik.library.app;

public class LibraryApp {
    private static final String APP_NAME = " Bibloteka v.0.11";
    public static void main(String[] args) {
        System.out.println(APP_NAME);

        LibraryControl lc = new LibraryControl();
        lc.loopControl();
    }
}
