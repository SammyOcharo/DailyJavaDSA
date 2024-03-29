package com.dev.DSA;

public class InputFactorial {
    //Is the Input Factorial of an Integer?
    //Create a function that checks if a given integer is exactly the factorial of an integer or not. true if it is, false otherwise.
    //
    //Examples
    //isFactorial(2) ➞ true
    //// 2 = 2 * 1 = 2!
    //
    //isFactorial(27) ➞ false
    //
    //isFactorial(24) ➞ true
    //// 24 = 4 * 3 * 2 * 1 = 4!

    public static boolean isFactorial(int number){
        int factorial = 1;

        for(int i=1; factorial <= number; i++){
            if(factorial == number){
                return true;
            }else{
                factorial *= i;
            }
        }

        return false;
    }
}
