package com.dev.DSA;

public class FirstNVowels {
    //First N Vowels
    //Write a function that returns the first n vowels of a string.
    //
    //Examples
    //firstNVowels("sharpening skills", 3) ➞ "aei"
    //
    //firstNVowels("major league", 5) ➞ "aoeau"
    //
    //firstNVowels("hostess", 5) ➞ "invalid"
    
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    
    public static String firstNVowels(String word, int occurence){
        int count = 0;
        StringBuilder vowelCombination = new StringBuilder();
        for(char c: word.toCharArray()){
            if(isVowel(c)){
                vowelCombination.append(c);
                count +=1;
                if (count == occurence){
                    break;
                }
            }
        }
        if(count == occurence){
            return vowelCombination.toString();
        }else if(count < occurence){
            return "invalid";
        } else{
            return "";
        }
    }
}
