package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinValidateTest {

    @Test
    void validate() {
        assertTrue(PinValidate.validate("121317"));
        assertFalse(PinValidate.validate("1213170000"));
        assertFalse(PinValidate.validate(""));
        assertTrue(PinValidate.validate("900876"));
        assertFalse(PinValidate.validate("uhuhuh"));
        assertTrue(PinValidate.validate("1317"));
    }
}