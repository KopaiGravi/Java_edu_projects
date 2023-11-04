package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        Book book1 = new Book("Book 1", "Author 1", "ISBN1", 2020);
        library.addBook(book1);

        assertEquals(1, library.getBooks().size());
        assertEquals(book1, library.getBooks().get(0));
    }

    @Test
    public void testFindBookByTitle() {
        Book book1 = new Book("Book 1", "Author 1", "ISBN1", 2020);
        library.addBook(book1);

        Book foundBook = library.findBookByTitle("Book 1");

        assertNotNull(foundBook);
        assertEquals("Book 1", foundBook.getTitle());
    }

    @Test
    public void testFindBookByTitleNotFound() {
        Book book1 = new Book("Book 1", "Author 1", "ISBN1", 2020);
        library.addBook(book1);

        Book notFoundBook = library.findBookByTitle("Book 2");

        assertNull(notFoundBook);
    }

    @Test
    public void testRemoveBookByIsbn() {
        Book book1 = new Book("Book 1", "Author 1", "ISBN1", 2020);
        library.addBook(book1);

        library.removeBookByIsbn("ISBN1");

        assertEquals(0, library.getBooks().size());
    }
}
