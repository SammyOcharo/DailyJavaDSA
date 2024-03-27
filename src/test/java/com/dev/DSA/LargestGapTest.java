package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestGapTest {

    @Test
    void largestGap() {
        int [] arr = {0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26};
        assertEquals("largest gap in the array is between 9 and 20 which is 11.", LargestGap.largestGap(arr));
    }
}