package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @Test
    void intToRoman() {
        assertEquals("LVIII", IntegerToRoman.intToRoman(58));
        assertEquals("MCMXCIV", IntegerToRoman.intToRoman(1994));
        assertEquals("MMMMMDCCCXLV", IntegerToRoman.intToRoman(5845));
        assertEquals("MMMDXLIII", IntegerToRoman.intToRoman(3543));
    }
}