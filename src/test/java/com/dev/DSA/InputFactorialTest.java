package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputFactorialTest {

    @Test
    void isFactorial() {
        assertTrue(InputFactorial.isFactorial(2));
        assertFalse(InputFactorial.isFactorial(3));
    }
}