// File: src/main/java/org/example/models/Item.java
package org.example.models;

public abstract class Item {
    private final String title;
    private boolean isBorrowed;

    public Item(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Item '" + getTitle() + "' borrowed.");
        } else {
            System.out.println("Item '" + getTitle() + "' is already borrowed.");
        }
    }

    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Item '" + getTitle() + "' returned.");
        } else {
            System.out.println("Item '" + getTitle() + "' is not borrowed.");
        }
    }

    public abstract void specificActionOnBorrow();

    public abstract void specificActionOnReturn();
}
