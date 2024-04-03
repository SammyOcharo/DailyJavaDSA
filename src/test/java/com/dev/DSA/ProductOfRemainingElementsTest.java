package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfRemainingElementsTest {

    @Test
    void canPartition() {
        int [] arr1 = {2, 8, 4, 1};
        int [] arr2 = {2, 8, 4, 17};
        assertTrue(ProductOfRemainingElements.canPartition(arr1));
        assertFalse(ProductOfRemainingElements.canPartition(arr2));

    }
}