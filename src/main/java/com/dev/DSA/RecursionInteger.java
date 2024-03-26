package com.dev.DSA;

public class RecursionInteger {
    //Create a function that recursively counts the integer's number of digits.
    //
    //Examples
    //count(318) ➞ 3
    //
    //count(-92563) ➞ 5
    //
    //count(4666) ➞ 4
    //
    //count(-314890) ➞ 6
    //
    //count(654321) ➞ 6
    //
    //count(638476) ➞ 6

    public static int count(int number){
        if(Math.abs(number) < 10){
            return 1;
        }else{

            return 1 + count(number/10);
        }

    }
}
