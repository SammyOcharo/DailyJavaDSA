package com.dev.DSA;

public class ProductOfRemainingElements {
    //Product of Remaining Elements
    //Write a function that returns true if you can partition an array into one element and the rest,
    // such that this element is equal to the product of all other elements excluding itself.
    //
    //Examples
    //canPartition([2, 8, 4, 1]) ➞ true
    //// 8 = 2 x 4 x 1
    //
    //canPartition([-1, -10, 1, -2, 20]) ➞ false
    //
    //canPartition([-1, -20, 5, -1, -2, 2]) ➞ true
    //Notes
    //The array may contain duplicates.
    //Multiple solutions can exist, any solution is sufficient to return true.

    public static boolean canPartition(int[] nums) {
        // Calculate the total product of all elements in the array
        int totalProduct = 1;
        for (int num : nums) {
            totalProduct *= num;
        }

        // Iterate through the array to check if any element is equal to the total product divided by itself
        for (int num : nums) {
            if (num != 0 && totalProduct % num == 0 && totalProduct / num == num) {
                return true;
            }
        }
        return false;
    }
}
