package com.dev.DSA;

public class RecursionHarshadNumber {
    //A number is said to be Harshad if it's exactly divisible by the sum of its digits.
    // Create a function that determines whether a number is a Harshad or not.
    //
    //Examples
    //isHarshad(75) ➞ false
    //// 7 + 5 = 12
    //// 75 is not exactly divisible by 12
    //
    //isHarshad(171) ➞ true
    //// 1 + 7 + 1 = 9
    //// 9 exactly divides 171
    //
    //isHarshad(481) ➞ true
    //
    //isHarshad(89) ➞ false
    //
    //isHarshad(516) ➞ true
    //
    //isHarshad(200) ➞ true

    public static boolean isDivisible(int number){
        int sumOfDigits = isHarshad(number);
        return number % sumOfDigits == 0;
    }
    public static int isHarshad(int number){
        int sum = 0;
        if(Math.abs(number) < 10){
            return sum += number;
        }else{

            return number % 10 + isHarshad(number/10);
        }
    }

}
