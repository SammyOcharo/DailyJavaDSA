package com.dev.DSA;

public class UnmixStrings {
    //Unmix My Strings
    //lPaeesh le pemu mnxit ehess rtnisg! Oh, sorry, that was supposed to say:
    // Please help me unmix these strings!
    //
    //Somehow my strings have all become mixed up; every pair of characters has been swapped.
    // Help me undo this so I can understand my strings again.
    //
    //Examples
    //unmix("123456") ➞ "214365"
    //
    //unmix("hTsii  s aimex dpus rtni.g") ➞ "This is a mixed up string."
    //
    //unmix("badce") ➞ "abcde"
    //Notes
    //The length of a string can be odd — in this case the last character is not altered
    // (as there's nothing to swap it with).

    public static String unmix(String str){
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length - 1; i += 2){
            char temp = chars[i];
            chars[i] = chars[i+1];
            chars[i+1] = temp;
        }
        return new String(chars);
    }


}
