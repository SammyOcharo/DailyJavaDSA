package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    @Test
    void rev() {

        assertEquals("1215", ReverseNumber.rev(5121));
        assertEquals("751221", ReverseNumber.rev(-122157));
    }
}