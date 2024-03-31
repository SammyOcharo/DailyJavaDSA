package com.dev.DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveRepeatedCharactersTest {

    @Test
    void unrepeated() {
        assertEquals("tesha", RemoveRepeatedCharacters.unrepeated("teshahset"));
        assertEquals("a", RemoveRepeatedCharacters.unrepeated("aaaaa"));
        assertEquals("cal 91", RemoveRepeatedCharacters.unrepeated("call 911"));
    }
}