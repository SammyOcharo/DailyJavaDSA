package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestGapTest {

    @Test
    void largestGap() {
        int [] arr = {0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26};
        int [] arr1 = {0, 0, 4, 5, 5, 6, 9, 20, 42, 46, 56};
        assertEquals("largest gap in the array is between 9 and 20 which is 11.", LargestGap.largestGap(arr));
        assertNotEquals("largest gap in the array is between 9 and 30 which is 21.", LargestGap.largestGap(arr1));
    }

    @Test
    void largestGapStreamsOption(){
        int[] array = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};

        assertEquals(11, LargestGap.largestGapStreamsOption(array));
    }
}