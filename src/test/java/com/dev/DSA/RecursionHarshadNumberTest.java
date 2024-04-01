package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionHarshadNumberTest {

    @Test
    void isDivisible() {
        assertFalse(RecursionHarshadNumber.isDivisible(75));
        assertTrue(RecursionHarshadNumber.isDivisible(481));
    }

    @Test
    void isHarshad() {
        assertEquals(12, RecursionHarshadNumber.isHarshad(75));
        assertEquals(13, RecursionHarshadNumber.isHarshad(481));
        assertNotEquals(20, RecursionHarshadNumber.isHarshad(481));
        assertNotEquals(22, RecursionHarshadNumber.isHarshad(481));
    }
}