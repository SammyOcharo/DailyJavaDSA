package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @Test
    void primeNumbers() {
        assertEquals(4, PrimeNumbers.primeNumbers(10));
        assertEquals(8, PrimeNumbers.primeNumbers(20));
    }
}