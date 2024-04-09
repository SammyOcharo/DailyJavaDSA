package com.dev.DSA;

public class Main {
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
    }
}
