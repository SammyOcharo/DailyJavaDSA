package com.dev.DSA;

import java.math.BigInteger;

public class CurzonNumbers {
    //Curzon Numbers
    //Given a positive integer n and if 1 plus 2 times n exactly divides 1 plus 2 raised to the power n,
    // then n is said to be a Curzon number.
    //
    //Write a function that determines whether a number is a Curzon number or not.
    //
    //Examples
    //isCurzon(5) ➞ true
    //// 2 ** 5 + 1 = 33
    //// 2 * 5 + 1 = 11
    //// 33 is a multiple of 11
    //
    //isCurzon(10) ➞ false
    //// 2 ** 10 + 1 = 1025
    //// 2 * 10 + 1 = 21
    //// 1025 is not a multiple of 21
    //
    //isCurzon(14) ➞ true
    //// 2 ** 14 + 1 = 16385
    //// 2 * 14 + 1 = 29
    //// 16385 is a multiple of 29
    //Notes
    //Use BigInteger or BigDecimal classes to deal with extremely big numbers.

    public static boolean isCurzon(int n){
        BigInteger power = BigInteger.valueOf(2).pow(n).add(BigInteger.ONE);
        BigInteger product = BigInteger.valueOf(2).multiply(BigInteger.valueOf(n)).add(BigInteger.ONE);

        return power.mod(product).equals(BigInteger.ZERO);
    }
}
