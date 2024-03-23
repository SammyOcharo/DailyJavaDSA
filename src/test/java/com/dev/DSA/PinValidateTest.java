package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinValidateTest {

    @Test
    void validate() {
        assertTrue(PinValidate.validate("121317"));
        assertFalse(PinValidate.validate("1213170000"));
    }
}