package com.dev.DSA;

public class ReverseNumber {
    //Reverse the Number
    //Create a function that takes an integer n and reverses it.
    //
    //Examples
    //rev(5121) ➞ "1215"
    //
    //rev(69) ➞ "96"
    //
    //rev(-122157) ➞ "751221"

    public static String rev(int number){
        String originalNumber = String.valueOf(Math.abs(number));

        StringBuilder reverseNumber = new StringBuilder();

        for(int i = originalNumber.length()-1; i>=0; i--){
            reverseNumber.append(originalNumber.charAt(i));
        }

        return reverseNumber.toString();
    }
}
