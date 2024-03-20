package com.dev.DSA;

public class FindMissingNumber {
    //Find the Missing Number
    //Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.
    //
    //Examples
    //missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
    //
    //missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10
    //
    //missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7

    public static int missingNum(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int sumOfTenDigits = 0;
        for(int i = 1; i <= 10; i++){
           sumOfTenDigits += i;
        }
        return sumOfTenDigits - sum;
    }
}
