// File: src/main/java/org/example/models/Book.java
package org.example.models;

public class Book extends Item {
    private final String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            super.borrowItem();
            System.out.println("Book '" + getTitle() + "' borrowed.");
        } else {
            System.out.println("Book '" + getTitle() + "' is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            super.returnItem();
            System.out.println("Book '" + getTitle() + "' returned.");
        } else {
            System.out.println("Book '" + getTitle() + "' is not borrowed.");
        }
    }

    @Override
    public void specificActionOnBorrow() {

    }

    @Override
    public void specificActionOnReturn() {

    }
}
