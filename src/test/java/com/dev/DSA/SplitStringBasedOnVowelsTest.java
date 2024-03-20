package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringBasedOnVowelsTest {

    @Test
    void isVowel() {
        assertTrue(SplitStringBasedOnVowels.isVowel('e'));
    }

    @Test
    void split() {
        assertEquals("eoHll!", SplitStringBasedOnVowels.split("Hello!"));
    }
}