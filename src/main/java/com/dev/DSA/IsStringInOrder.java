package com.dev.DSA;

public class IsStringInOrder {
    //Create a function that takes a string and returns true or false, depending on whether the characters are in order or not.

    //Examples
    //isInOrder("abc") ➞ true
    //
    //isInOrder("edabit") ➞ false
    //
    //isInOrder("123") ➞ true
    //isInOrder("123") -> false

    public static boolean isInOrder(String str){
        for(int i=0; i < str.length() -1; i++){
            if(str.charAt(i) > str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
