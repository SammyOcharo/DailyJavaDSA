package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsStringInOrderTest {
    @Test
    public void testIsInOrder() {
        assertFalse(IsStringInOrder.isInOrder("apc"));    // Expected: true
        assertTrue(IsStringInOrder.isInOrder("abc")); // Expected: false
        assertTrue(IsStringInOrder.isInOrder("123"));    // Expected: true
        assertTrue(IsStringInOrder.isInOrder("789"));   // Expected: false
        assertFalse(IsStringInOrder.isInOrder("xoz"));   // Expected: true
    }
}