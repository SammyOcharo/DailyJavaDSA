package com.dev.DSA;

import java.util.*;

public class IntegerToRoman {
    //Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    //
    //Symbol       Value
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000
    //For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
    //
    //Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
    //
    //I can be placed before V (5) and X (10) to make 4 and 9.
    //X can be placed before L (50) and C (100) to make 40 and 90.
    //C can be placed before D (500) and M (1000) to make 400 and 900.
    //Given an integer, convert it to a roman numeral.
    //
    //
    //
    //Example 1:
    //
    //Input: num = 3
    //Output: "III"
    //Explanation: 3 is represented as 3 ones.
    //Example 2:
    //
    //Input: num = 58
    //Output: "LVIII"
    //Explanation: L = 50, V = 5, III = 3.
    //Example 3:
    //
    //Input: num = 1994
    //Output: "MCMXCIV"
    //Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    public static String intToRoman(int number){
        Map<String, Integer> symbolValueMap = new HashMap<>();
        symbolValueMap.put(String.valueOf('I'), 1);
        symbolValueMap.put("IV", 4);
        symbolValueMap.put(String.valueOf('V'), 5);
        symbolValueMap.put("IX", 9);
        symbolValueMap.put(String.valueOf('X'), 10);
        symbolValueMap.put("XL", 40);
        symbolValueMap.put(String.valueOf('L'), 50);
        symbolValueMap.put("XC", 90);
        symbolValueMap.put(String.valueOf('C'), 100);
        symbolValueMap.put("CD", 400);
        symbolValueMap.put(String.valueOf('D'), 500);
        symbolValueMap.put("CM", 900);
        symbolValueMap.put(String.valueOf('M'), 1000);

        // Create a list of symbols in descending order based on their values
        List<String> symbols = new ArrayList<>(symbolValueMap.keySet());
        symbols.sort(Comparator.comparingInt(symbolValueMap::get).reversed());

        StringBuilder roman = new StringBuilder();

        for(String symbol: symbols){
            int value = symbolValueMap.get(symbol);

            while(number >= value){
                roman.append(symbol);
                number -= value;
            }
        }
        return roman.toString();
    }
}
