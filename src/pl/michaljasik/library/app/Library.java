package pl.michaljasik.library.app;

import pl.michaljasik.library.io.DataReader;
import pl.michaljasik.library.model.Book;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        final String  appName= "Version 0.8 ";
        int totalBook=1000;

        Book[] books = new Book[totalBook];
        Scanner sc = new Scanner(System.in);
        DataReader dr = new DataReader();

        books[0]=dr.readAndCreate();
        dr.close();
        books[0].getInfo();


    }
}
