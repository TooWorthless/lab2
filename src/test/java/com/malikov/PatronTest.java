package com.malikov;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.malikov.item.Item;
import com.malikov.items.Book;


public class PatronTest {

    private Book book;
    private Patron patron;

    @BeforeEach
    void setUp() {
        this.book = new Book("BookTtile", "BookAuthor");
        this.patron = new Patron("PatronName");
    }

    @Test
    void testBorrow() {
        this.patron.borrow(this.book);
        List<Item> testItemsList = this.patron.getBorrowedItems();
        assertEquals(testItemsList.get(0), this.book);
    }

    @Test
    void testReturnItem() {
        this.patron.borrow(this.book);
        this.patron.returnItem(this.book);
        assertTrue(this.patron.getBorrowedItems().isEmpty());
    }

    @Test
    void testReturnIncorrectItem() {
        assertThrows(RuntimeException.class, () -> this.patron.returnItem(this.book));
    }

    
}
