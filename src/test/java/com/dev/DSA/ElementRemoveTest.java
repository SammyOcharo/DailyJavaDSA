package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementRemoveTest {

    @Test
    void removeElement() {

        int [] nums = {3,2,2,3};
        int val  = 3;

        assertEquals(2, ElementRemove.removeElement(nums,val));
    }
}