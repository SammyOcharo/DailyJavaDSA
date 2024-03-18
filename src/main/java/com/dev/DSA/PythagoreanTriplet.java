package com.dev.DSA;

public class PythagoreanTriplet {
    //Pythagorean Triplet
    //Create a function that validates whether the three given integers form a Pythagorean triplet which is defined as
    // the sum of the squares of the two smallest integers must be equal to the square of the largest integer.
    //
    //Examples
    //isTriplet(3, 4, 5) ➞ true
    //// 3² + 4² = 25
    //// 5² = 25
    //
    //isTriplet(13, 5, 12) ➞ true
    //// 5² + 12² = 169
    //// 13² = 169
    //
    //isTriplet(1, 2, 3) ➞ false
    //// 1² + 2² = 5
    //// 3² = 9
    //
    //isTriplet(72, 54, 90) ➞ true
    //
    //isTriplet(54, 46, 77) ➞ false
    //
    //isTriplet(80, 48, 64) ➞ true

    public static boolean tripletFinder(int a, int b, int c){

        if(a > b && a>c ){
            int temp = 0;
            temp = a;
            a = c;
            c = temp;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        } else if(b> a && b>c){
            int temp = 0;
            temp = b;
            b = c;
            c = temp;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        int squareA = a*a;
        int squareB = b*b;
        int sum = squareA + squareB;

        int squareC = c*c;

        return sum == squareC;

    }
}
