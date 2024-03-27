package com.dev.DSA;

import java.util.Arrays;

public class LargestGap {
    //Largest Gap
    //Given an array of integers, return the largest gap between the sorted elements of the array.
    //
    //For example, consider the array:
    //
    //[9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
    //... in which, after sorting, the array becomes:
    //
    //[0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
    //... so that we now see that the largest gap in the array is between 9 and 20 which is 11.

    public static String largestGap(int[] arr){
        int largestGap = 0;
        int lowerBound = 0;
        int upperBound = 0;
        Arrays.sort(arr);

        for(int i=0; i < arr.length-1; i++){
            if((arr[i+1] - arr[i]) > largestGap){
                largestGap = arr[i+1] - arr[i];

                lowerBound = arr[i];
                upperBound = arr[i+1];
            }

        }

        return "largest gap in the array is between " + lowerBound + " and " + upperBound + " which is " + (upperBound - lowerBound) + ".";
    }
}
