package com.dev.DSA;

import java.util.Arrays;

public class NumberedCards {
    //Numbered Cards
    //You have a pack of 5 randomly numbered cards, which can range from 0-9.
    // You can win if you can produce a higher two-digit number from your cards than your opponent.
    // Return true if your cards win that round.
    //
    //Examples
    //winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true
    //// Your cards can make the number 96
    //// Your opponent can make the number 73
    //// You win the round since 96 > 73
    //
    //winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true
    //
    //winRound([1, 2, 3, 4, 5], [9, 8, 7, 6, 5]) ➞ false
    //
    //winRound([4, 3, 4, 4, 5], [3, 2, 5, 4, 1]) ➞ false

    public static boolean winRound(int[] arr1, int[] arr2){
        if(arr1.length == 0 || arr2.length == 0){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        int secondLast = arr1[arr1.length -2];
        int last = arr1[arr1.length -1];

        int number = Integer.parseInt(String.valueOf(last) + String.valueOf(secondLast));


        int secondArraySecondLast = arr2[arr2.length -2];
        int secondArrayLast = arr2[arr2.length -1];

        int number2 = Integer.parseInt(String.valueOf(secondArrayLast) + String.valueOf(secondArraySecondLast));

        return number > number2;
    }
}
