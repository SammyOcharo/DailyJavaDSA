package com.dev.DSA;

public class Main {
    //Video Length in Seconds
    //You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54").
    // Create a function that takes the video length and return it in seconds.
    //
    //Examples
    //minutesToSeconds("01:00") ➞ 60
    //
    //minutesToSeconds("13:56") ➞ 836
    //
    //minutesToSeconds("10:60") ➞ -1
    //Notes
    //The video length is given as a string.
    //If the number of seconds is 60 or over, return -1 (see example #3).
    //You may get a number of minutes over 99 (e.g. "121:49" is perfectly valid).
    public static int minutesToSeconds(String time) {
        // Split the time string into minutes and seconds
        String[] parts = time.split(":");

        // Parse minutes and seconds
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);

        // Check if seconds are over 60
        if (seconds >= 60) {
            return -1;
        }

        // Calculate total seconds
        return minutes * 60 + seconds;
    }

    public static void main(String[] args) {
        // Test the function with examples
        System.out.println(minutesToSeconds("01:00")); // ➞ 60
        System.out.println(minutesToSeconds("13:56")); // ➞ 836
        System.out.println(minutesToSeconds("10:60")); // ➞ -1
        System.out.println(minutesToSeconds("00:00"));
    }
}
