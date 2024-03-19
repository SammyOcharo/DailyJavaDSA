package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    void gcd() {

        assertEquals(2, GCD.gcd(4, 18));
        assertEquals(1, GCD.gcd(3, 5));
    }
}