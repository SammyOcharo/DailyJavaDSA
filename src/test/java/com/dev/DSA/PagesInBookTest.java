package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagesInBookTest {

    @Test
    void findPagesTotalInBook() {
        assertTrue(PagesInBook.findPagesTotalInBook(4005));
        assertFalse(PagesInBook.findPagesTotalInBook(5));
    }
}