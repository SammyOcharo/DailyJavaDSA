package com.dev.DSA;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InstantJazzTest {

    @Test
    void jazzify() {
        String [] expected = {"G7", "F7", "C7"};
        String [] given = {"G", "F", "C"};

        String [] expected1 = {"F7", "E7", "A7", "Ab7", "Gm7", "7"};
        String [] given1 = {"F7", "E7", "A7", "Ab7", "Gm7", "C7"};

        String [] expected2 = {};
        String [] given2 = {};

        assertEquals(Arrays.toString(expected), Arrays.toString(InstantJazz.jazzify(given)));
        assertNotEquals(Arrays.toString(expected1), Arrays.toString(InstantJazz.jazzify(given1)));
        assertEquals(Arrays.toString(expected2), Arrays.toString(InstantJazz.jazzify(given2)));
    }
}