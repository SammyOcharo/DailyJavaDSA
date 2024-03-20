package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringCaseTest {

    @Test
    void reverseCase() {
        assertEquals("hAPPY bIRTHDAY", ReverseStringCase.reverseCase("Happy Birthday"));
        assertEquals("SpOnTaNeOuS", ReverseStringCase.reverseCase("sPoNtAnEoUs"));
    }
}