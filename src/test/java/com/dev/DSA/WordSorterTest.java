package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSorterTest {

    @Test
    void sortByLength() {

        assertEquals("my Hello friend", WordSorter.sortByLength("Hello my friend"));
        assertEquals("a day Have wonderful", WordSorter.sortByLength("Have a wonderful day"));
        assertNotEquals("My loves son pineapples", WordSorter.sortByLength("My son loves pineapples"));
    }
}