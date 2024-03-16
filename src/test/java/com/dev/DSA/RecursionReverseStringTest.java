package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionReverseStringTest {

    @Test
    void reverseString() {
        assertEquals("olleh", RecursionReverseString.ReverseString("hello"));
        assertNotEquals("olleh", RecursionReverseString.ReverseString("word"));
        assertEquals("", RecursionReverseString.ReverseString(""));
    }
}