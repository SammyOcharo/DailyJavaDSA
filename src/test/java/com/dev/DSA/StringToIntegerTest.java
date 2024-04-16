package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @Test
    void myAtoi() {

        assertEquals(4193, StringToInteger.myAtoi("4193 with words"));
        assertEquals(-42, StringToInteger.myAtoi("-42"));
        assertEquals(42, StringToInteger.myAtoi("42"));
    }
}