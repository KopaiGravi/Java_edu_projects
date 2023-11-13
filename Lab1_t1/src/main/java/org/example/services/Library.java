// File: src/main/java/org/example/services/Library.java
package org.example.services;

import org.example.models.Item;
import org.example.models.Patron;
import org.example.models.Book;
import org.example.models.DVD;

import java.util.ArrayList;
import java.util.List;

public class Library implements IManageble {
    private final List<Item> items;
    private final List<Patron> patrons;

    public Library() {
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
        addItemToLibrary(new Book("The Quantum Waffle Conspiracy", "Professor Pamplemousse"));
        addItemToLibrary(new Book("The Adventures of the Moonwalking Giraffe", "Dr. Dingleberry McSnort"));
        addItemToLibrary(new Book("The Legend of the Llama Who Could Speak French", "Baron von Banana Split"));
        addItemToLibrary(new DVD("The Flying Spaghetti Monster's Cookbook", 2006));
        addItemToLibrary(new DVD("The Mysterious Case of the Singing Pickles", 19870));
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void remove(Item item) {
        items.remove(item);
    }

    @Override
    public void listAvailable() {
        for (Item item : items) {
            if (!item.isBorrowed()) {
                System.out.println(item.getTitle());
            }
        }
    }

    @Override
    public void listBorrowed() {
        for (Patron patron : patrons) {
            List<Item> borrowedItems = patron.getBorrowedItems();
            for (Item item : borrowedItems) {
                System.out.println("Patron: " + patron.getName() + ", Borrowed Item: " + item.getTitle());
            }
        }
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public void lendItem(Patron patron, Item item) {
        if (!item.isBorrowed()) {
            patron.borrow(item);
            item.borrowItem();
            System.out.println("Item '" + item.getTitle() + "' lent to Patron '" + patron.getName() + "'.");
        } else {
            System.out.println("Item '" + item.getTitle() + "' is already borrowed.");
        }
    }

    public void returnItem(Patron patron, Item item) {
        if (patron.getBorrowedItems().contains(item)) {
            patron.returnItem(item);
            item.returnItem();
            System.out.println("Item '" + item.getTitle() + "' returned by Patron '" + patron.getName() + "'.");
        } else {
            System.out.println("Patron '" + patron.getName() + "' did not borrow item '" + item.getTitle() + "'.");
        }
    }

    public Item getItemByTitle(String title) {
        for (Item item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void addItemToLibrary(Item item) {
        items.add(item);
    }
}
