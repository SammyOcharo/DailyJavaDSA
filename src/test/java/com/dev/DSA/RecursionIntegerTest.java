package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionIntegerTest {

    @Test
    void count() {
        assertEquals(3, RecursionInteger.count(318));
        assertEquals(6, RecursionInteger.count(654321));
    }
}