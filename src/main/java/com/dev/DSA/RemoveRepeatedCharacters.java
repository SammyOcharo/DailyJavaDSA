package com.dev.DSA;

import java.util.HashSet;
import java.util.Set;

public class RemoveRepeatedCharacters {
    //Remove Repeated Characters
    //Create a function that will remove any repeated character(s) in a word passed to the function.
    // Not just consecutive characters, but characters repeating anywhere in the string.
    //
    //Examples
    //unrepeated("teshahset") ➞ "tesha"
    //
    //unrepeated("hello") ➞ "helo"
    //
    //unrepeated("aaaaa") ➞ "a"
    //
    //unrepeated("WWE!!!") ➞ "WE!"
    //
    //unrepeated("call 911") ➞ "cal 91"

    public static String unrepeated(String word){
        Set<Character> newWord = new HashSet<>();
        StringBuilder madeWord = new StringBuilder();

        for(char c: word.toCharArray()){
            if(newWord.add(c)){
                madeWord.append(c);
            }

        }

        System.out.println(madeWord);

        return madeWord.toString();
    }
}
