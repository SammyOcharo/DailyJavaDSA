package com.dev.DSA;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RoundingToMillionsTest {

    @Test
    void millionsRounding() {
        Object[][] cities1 = {
                {"Nice", 942208},
                {"Abu Dhabi", 1482816},
                {"Naples", 2186853},
                {"Vatican City", 572}
        };
        Object[][] cities2 = {
                {"Manila", 13923452},
                {"Kuala Lumpur", 7996830},
                {"Jakarta", 10770487}
        };

        Object[][] ExpectedCities1 = {
                {"Nice", 1000000},
                {"Abu Dhabi", 1000000},
                {"Naples", 2000000},
                {"Vatican City", 0}
        };
        Object[][] ExpectedCities2 = {
                {"Manila", 14000000},
                {"Kuala Lumpur", 8000000},
                {"Jakarta", 11000000}
        };

        RoundingToMillions.millionsRounding(cities1);
        RoundingToMillions.millionsRounding(cities2);


        assertTrue(Arrays.deepEquals(ExpectedCities1, cities1));
        assertTrue(Arrays.deepEquals(ExpectedCities2, cities2));

    }
}