package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnmixStringsTest {

    @Test
    void unmix() {
        assertEquals("This is a mixed up string.", UnmixStrings.unmix("hTsii  s aimex dpus rtni.g"));
        assertNotEquals("This is a mixed up string..", UnmixStrings.unmix("hTsii  s aimex dpus rtni.g"));
    }
}