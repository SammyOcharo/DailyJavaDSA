package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberedCardsTest {

    @Test
    void winRound() {

        int[] arr1 = {2, 5, 2, 6, 9};
        int[] arr2 = {3, 7, 3, 1, 2};
        int [] arr3 = {};
        assertTrue(NumberedCards.winRound(arr1, arr2));
        assertFalse(NumberedCards.winRound(arr1, arr1));
        assertFalse(NumberedCards.winRound(arr3, arr3));
    }
}