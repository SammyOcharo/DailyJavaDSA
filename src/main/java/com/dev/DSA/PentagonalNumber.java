package com.dev.DSA;

public class PentagonalNumber {
    //Write a function that takes a positive integer num and calculates how many dots exist in a pentagonal shape around the center dot on the Nth iteration.
    //
    //In the image below you can see the first iteration is only a single dot.
    // On the second, there are 6 dots. On the third, there are 16 dots, and on the fourth there are 31 dots.

    //pentagonal(1) ➞ 1
    //
    //pentagonal(2) ➞ 6
    //
    //pentagonal(3) ➞ 16
    //
    //pentagonal(8) ➞ 141

    public static int pentagonal(int number){
        int sumRepetitive = 0;
        for(int i=2; i < number; i++){
            int loopSum = 5*i;
            sumRepetitive += loopSum;

        }

        return 5+1+sumRepetitive;
    }
}
