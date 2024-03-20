package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNVowelsTest {

    @Test
    void isVowel() {
        assertTrue(FirstNVowels.isVowel('u'));
    }

    @Test
    void firstNVowels() {
        assertEquals("aei", FirstNVowels.firstNVowels("sharpening skills", 3));
        assertEquals("invalid", FirstNVowels.firstNVowels("hostess", 5));
    }
}