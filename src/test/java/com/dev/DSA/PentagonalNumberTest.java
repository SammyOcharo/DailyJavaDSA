package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PentagonalNumberTest {

    @Test
    void pentagonal() {

        assertEquals(16, PentagonalNumber.pentagonal(3));
        assertEquals(141, PentagonalNumber.pentagonal(8));
        assertNotEquals(1854, PentagonalNumber.pentagonal(52));
        assertNotEquals(1754, PentagonalNumber.pentagonal(47));

    }
}