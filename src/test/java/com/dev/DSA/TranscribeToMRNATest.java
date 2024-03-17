package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranscribeToMRNATest {

    @Test
    void dnaToRna() {
        assertEquals("UAAUCGCGCUAUAUGCGCAUG", TranscribeToMRNA.dnaToRna("ATTAGCGCGATATACGCGTAC"));
        assertNotEquals("GCUAUAA", TranscribeToMRNA.dnaToRna("CGATATA"));
    }
}