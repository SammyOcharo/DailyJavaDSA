package com.dev.DSA;

import java.util.regex.Pattern;

public class PinValidate {
    //RegEx: Validate PIN
    //Create a function that will test if a string is a valid PIN or not via a regular expression.
    //
    //A valid PIN has:
    //
    //Exactly 4 or 6 characters.
    //Only numeric characters (0-9).
    //No whitespace.
    //Examples
    //validate("121317") ➞ true
    //
    //validate("1234") ➞ true
    //
    //validate("45135") ➞ false
    //
    //validate("89abc1") ➞ false
    //
    //validate("900876") ➞ true
    //
    //validate(" 4983") ➞ false
    //Notes
    //Empty strings should return false when tested.

    public static boolean validate(String pin){
        String pattern = "^(\\d{4}|\\d{6})$";

        Pattern regex = Pattern.compile(pattern);

        return regex.matcher(pin).matches();
    }
}
