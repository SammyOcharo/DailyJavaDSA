package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurzonNumbersTest {

    @Test
    void isCurzon() {
        assertTrue(CurzonNumbers.isCurzon(5));
        assertFalse(CurzonNumbers.isCurzon(8));
    }
}