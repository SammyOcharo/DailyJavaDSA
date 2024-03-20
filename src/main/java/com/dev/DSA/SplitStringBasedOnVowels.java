package com.dev.DSA;

public class SplitStringBasedOnVowels {
    //Split a String Based on Vowels and Consonants
    //Write a function that takes a string, breaks it up and returns it with vowels first, consonants second.
    // For any character that's not a vowel (like special characters or spaces), treat them like consonants.
    //
    //Examples
    //split("abcde") ➞ "aebcd"
    //
    //split("Hello!") ➞ "eoHll!"
    //
    //split("What's the time?") ➞ "aeieWht's th tm?"

    public static boolean isVowel(char c){

        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static String  split(String word){
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();


        for(char c: word.toCharArray()){
            if(Character.isLetter(c)){
                if(isVowel(c)){
                    vowels.append(c);
                }else{
                    consonants.append(c);
                }
            }else {
                consonants.append(c); // Treat non-letter characters as consonants
            }
        }

        return vowels.toString() + consonants;
    }
}
