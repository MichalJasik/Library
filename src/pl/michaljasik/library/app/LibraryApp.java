package pl.michaljasik.library.app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName="Bibloteka 0.9";
        System.out.println(appName);

        LibraryControl lc = new LibraryControl();
        lc.loopControl();
    }
}
