package com.dev.DSA;

public class RecussionSumArray {
    //Recursion: Array Sum
    //Write a function that finds the sum of an array. Make your function recursive.
    //
    //Examples
    //sum([1, 2, 3, 4]) ➞ 10
    //
    //sum([1, 2]) ➞ 3
    //
    //sum([1]) ➞ 1
    //
    //sum([]) ➞ 0

    public static int SumArray(int[] arr){


        return sumArrayHelper(arr, arr.length);
    }

    private static int sumArrayHelper(int[] arr, int index) {
        if(index == 0){
            return 0;
        }else{
            return arr[index-1] + sumArrayHelper(arr, index-1);
        }
    }
}
