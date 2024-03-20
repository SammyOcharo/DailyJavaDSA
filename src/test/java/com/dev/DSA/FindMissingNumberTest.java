package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingNumberTest {

    @Test
    void missingNum() {
        int[] arr = {10, 5, 1, 2, 4, 6, 8, 3, 9};
        int[] arr1 = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        assertEquals(7,FindMissingNumber.missingNum(arr));
        assertNotEquals(6,FindMissingNumber.missingNum(arr1));
    }
}