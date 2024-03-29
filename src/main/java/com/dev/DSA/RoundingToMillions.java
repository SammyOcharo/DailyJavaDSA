package com.dev.DSA;

import java.util.ArrayList;
import java.util.List;

public class RoundingToMillions {
    //Rounding In Millions
    //Given an array of cities and populations, return an array
    // where all populations are rounded to the nearest million.
    //
    //Examples
    //millionsRounding([
    //  ["Nice", 942208],
    //  ["Abu Dhabi", 1482816],
    //  ["Naples", 2186853],
    //  ["Vatican City", 572]
    //]) ➞ [
    //  ["Nice", 1000000],
    //  ["Abu Dhabi", 1000000],
    //  ["Naples", 2000000],
    //  ["Vatican City", 0]
    //]
    //
    //millionsRounding([
    //  ["Manila", 13923452],
    //  ["Kuala Lumpur", 7996830],
    //  ["Jakarta", 10770487]
    //]) ➞ [
    //  ["Manila", 14000000],
    //  ["Kuala Lumpur", 8000000],
    //  ["Jakarta", 11000000]
    //]

    public static List<Object[]> millionsRounding(Object[][] cities){
        List<Object[]> result = new ArrayList<>();
        for(Object[] city : cities){
            String cityName = (String) city[0];
            int population = (int) city[1];
            int roundedPopulation = (int) Math.round((double) population/1000000 )* 1000000;
            city[1] = roundedPopulation;

            result.add(new Object[]{cityName, roundedPopulation});
        }
        return result;
    }
}
