package com.dev.DSA;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EliminateOddNumberFromArrayTest {

    @Test
    void noOdds() {
        int[] expected = {718, 644, 380, 440};
        int[] results = {718, 991, 449, 644, 380, 440};
        assertEquals(Arrays.toString(expected), Arrays.toString(EliminateOddNumberFromArray.noOdds(results)));
    }
}