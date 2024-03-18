package com.dev.DSA;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ReturnKeyValueTest {

    @Test
    void getValues() {
        List<String> expected = List.of("1", "2", "3");
        List<String> actual = ReturnKeyValue.getValues(Map.of("a", "1", "b", "2", "c", "3"));
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}