package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTripletTest {

    @Test
    void tripletFinder() {
        assertTrue(PythagoreanTriplet.tripletFinder(3,4,5));
        assertFalse(PythagoreanTriplet.tripletFinder(1,2,3));
        assertTrue(PythagoreanTriplet.tripletFinder(80,48,64));
    }
}