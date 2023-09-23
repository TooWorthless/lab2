package com.malikov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.malikov.items.Book;


public class BookTest {

    @Test
    void testIncorrectTitle() {
        assertThrows(IllegalArgumentException.class, () -> new Book("", "Author"));
    }

    @Test
    void testIncorrectAuthor() {
        Book correctBook = new Book("BookTitle", "BookAuthor");
        assertThrows(IllegalArgumentException.class, () -> new Book("Title", ""));
        assertThrows(IllegalArgumentException.class, () -> correctBook.setAuthor(""));
    }

    @Test 
    void testBorrow() {
        assertFalse( (new Book("Title", "Author")).borrowStatus() );
    }
}