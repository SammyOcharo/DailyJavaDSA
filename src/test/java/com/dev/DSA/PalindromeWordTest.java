package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeWordTest {

    @Test
    void isPalindrome() {
        assertTrue(PalindromeWord.isPalindrome("madam"));
        assertTrue(PalindromeWord.isPalindrome("rotor"));
        assertFalse(PalindromeWord.isPalindrome("adieu"));
    }

    @Test
    void isPalindromeWithRecursion(){
        assertTrue(PalindromeWord.isPalindromeWithRecursion("madam"));
        assertTrue(PalindromeWord.isPalindromeWithRecursion("rotor"));
        assertFalse(PalindromeWord.isPalindromeWithRecursion("adieu"));
    }
}