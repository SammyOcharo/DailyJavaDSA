package com.dev.DSA;

public class GCD {

    //Create a function that takes two numbers as arguments and returns the Greatest Common Divisor (GCD) of the two numbers.
    //
    //Examples
    //gcd(3, 5) ➞ 1
    //
    //gcd(14, 28) ➞ 14
    //
    //gcd(4, 18) ➞ 2

    public static int gcd(int a, int b){

        while(b != 0){

            int temp = b;

            b = a % b ;

            a = temp;


        }

        return a;
    }
}
