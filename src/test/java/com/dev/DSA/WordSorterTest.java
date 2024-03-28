package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSorterTest {

    @Test
    void sortByLength() {

        assertEquals("my Hello friend", WordSorter.sortByLength("Hello my friend"));
    }
}