package com.dev.DSA;

public class IsStringInOrder {
    //Create a function that takes a string and returns true or false, depending on whether the characters are in order or not.

    //Examples
    //isInOrder("abc") ➞ true
    //
    //isInOrder("edabit") ➞ false
    //
    //isInOrder("123") ➞ true


    public static boolean isInOrder(String str){
        for(int i=0; i < str.length() -1; i++){
            if(str.charAt(i) > str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        System.out.println(isInOrder("abc"));
        System.out.println(isInOrder("edabit"));
        System.out.println(isInOrder("123"));
        System.out.println(isInOrder("xyzz"));
    }
}
