package com.dev.DSA;

import java.util.Arrays;
import java.util.Comparator;

public class WordSorter {
    //Create a function that takes a string and returns a string ordered by the length of the words.
    // From shortest to longest word. If there are words with the same amount of letters, order them alphabetically.
    //
    //Examples
    //sortByLength("Hello my friend") ➞ "my Hello friend"
    //
    //sortByLength("Have a wonderful day") ➞ "a day Have wonderful"
    //
    //sortByLenght("My son loves pineapples") ➞ "My son loves pineapples"

    public static String sortByLength(String word){

        String [] wordsArray = word.split("\\s+");

        Arrays.sort(wordsArray, Comparator.comparing(String::length).thenComparing(String::compareTo));

        return String.join(" ", wordsArray);
    }
}
