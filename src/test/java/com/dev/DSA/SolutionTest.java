package com.dev.DSA;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {
        int[] arr = {2,3,4};
        int[] expected = {0,2};
        assertEquals(Arrays.toString(expected), Arrays.toString(Solution.twoSum(arr, 6)));
    }
}