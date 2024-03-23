package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenBoomTest {

    @Test
    void sevenBoom() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 8};
        assertEquals("Boom!", SevenBoom.sevenBoom(arr));
        assertNotEquals("Boom!", SevenBoom.sevenBoom(arr1));
    }
}