package org.example;

import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void removeBookByIsbn(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Quantum Waffle Conspiracy", "Professor Pamplemousse", "978-1647293210", 155);
        Book book2 = new Book("The Adventures of the Moonwalking Giraffe", "Dr. Dingleberry McSnort", "978-1423113653", 2300);
        Book book3 = new Book("The Legend of the Llama Who Could Speak French", "Baron von Banana Split", "978-0465036589", 1975);
        Book book4 = new Book("The Flying Spaghetti Monster's Cookbook", "Madame Meatball Mariner", "978-0812976560", 2006);
        Book book5 = new Book("The Mysterious Case of the Singing Pickles", "Captain Quackers Qwackerson", "978-0553297867", 19870);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        System.out.println("All books in the library:");
        library.showAllBooks();

        String searchTitle = "The Quantum Waffle Conspiracy";
        System.out.println("\nSearching for a book with title: " + searchTitle);
        Book foundBook = library.findBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        String isbnToDelete = "978-1647293210";
        System.out.println("\nRemoving a book with ISBN: " + isbnToDelete);
        library.removeBookByIsbn(isbnToDelete);

        System.out.println("\nUpdated list of books in the library:");
        library.showAllBooks();
    }

    public InsnList getBooks() {
        return null;
    }
}
