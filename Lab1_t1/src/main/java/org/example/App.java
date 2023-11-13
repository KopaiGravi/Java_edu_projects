// File: src/main/java/org/example/App.java
package org.example;

import org.example.models.Book;
import org.example.models.DVD;
import org.example.models.Patron;
import org.example.services.Library;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Quantum Waffle Conspiracy", "Professor Pamplemousse");
        Book book2 = new Book("The Adventures of the Moonwalking Giraffe", "Dr. Dingleberry McSnort");
        DVD dvd1 = new DVD("The Flying Spaghetti Monster's Cookbook", 2006);

        library.addItemToLibrary(book1);
        library.addItemToLibrary(book2);
        library.addItemToLibrary(dvd1);

        Patron patron1 = new Patron("Borshch Maksym", "ID123");
        Patron patron2 = new Patron("Valentin Tkachishen", "ID456");

        library.registerPatron(patron1);
        library.registerPatron(patron2);

        library.lendItem(patron1, book1);
        library.lendItem(patron2, dvd1);

        System.out.println("All items in the library:");
        library.listAvailable();

        System.out.println("\nAll borrowed items:");
        library.listBorrowed();
    }
}