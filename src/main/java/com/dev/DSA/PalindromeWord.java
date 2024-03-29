package com.dev.DSA;

public class PalindromeWord {
    //Recursion: Palindrome Word
    //Create a recursive function that determines whether a word is a palindrome or not.
    //
    //Examples
    //isPalindrome("madam") ➞ true
    //
    //isPalindrome("adieu") ➞ false
    //
    //isPalindrome("rotor") ➞ true

    //without recursion
    public static boolean isPalindrome(String word){

        StringBuilder newWord = new StringBuilder();
        for(char c: word.toCharArray()){
            newWord.insert(0, c);
        }

        return newWord.toString().equals(word);
    }

    //with recursion
    public static boolean isPalindromeWithRecursion(String word){

        if(word.isEmpty() || word.length() == 1){
            return true;
        }

        char firstCharacter = word.charAt(0);
        char lastCharacter = word.charAt(word.length()-1);

        if (firstCharacter != lastCharacter){
            return false;
        }

        return isPalindromeWithRecursion(word.substring(1, word.length() -1));
    }
}
