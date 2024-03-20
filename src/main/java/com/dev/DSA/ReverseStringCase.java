package com.dev.DSA;

public class ReverseStringCase {
    //Reverse the Case
    //Given a string, create a function to reverse the case. All lower-cased letters should be upper-cased, and vice versa.
    //
    //Examples
    //reverseCase("Happy Birthday") ➞ "hAPPY bIRTHDAY"
    //
    //reverseCase("MANY THANKS") ➞ "many thanks"
    //
    //reverseCase("sPoNtAnEoUs") ➞ "SpOnTaNeOuS"

    public static String reverseCase(String word){

        StringBuilder newWord = new StringBuilder();

        for(char c: word.toCharArray()){
            if(Character.isLowerCase(c)){
                newWord.append(Character.toUpperCase(c));
            }else{
                newWord.append(Character.toLowerCase(c));
            }
        }

        return newWord.toString();
    }
}
