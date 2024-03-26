package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveNumbersTest {

    @Test
    void cons() {
        int [] arr = {5, 1, 4, 3, 2};
        int [] arr1 = {5, 1, 4, 3, 2, 8};
        assertTrue(ConsecutiveNumbers.cons(arr));
        assertFalse(ConsecutiveNumbers.cons(arr1));
    }
}