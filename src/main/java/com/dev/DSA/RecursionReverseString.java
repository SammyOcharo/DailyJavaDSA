package com.dev.DSA;

public class RecursionReverseString {

    //Write a function that reverses a string. Make your function recursive.

    //Examples
    //reverse("hello") ➞ "olleh"
    //
    //reverse("world") ➞ "dlrow"
    //
    //reverse("a") ➞ "a"
    //
    //reverse("") ➞ ""

    public static String ReverseString(String str){

        if(str.isEmpty() || str.length() == 1){
            return str;
        }else{
            return str.charAt(str.length() - 1) + ReverseString(str.substring(0, str.length()-1));
        }
    }

}
