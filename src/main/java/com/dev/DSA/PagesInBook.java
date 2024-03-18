package com.dev.DSA;

public class PagesInBook {
    //Pages in a Book
    //Suppose that you add all the page numbers in a book. If the total is 21, the book could only have 6 pages because 1 + 2 + 3 + 4 + 5 + 6 = 21.
    // If I had said the total were 25, that would be impossible because the next number in the series is 28 (21 + 7).
    //
    //Create a function that, given the total number of pages as an argument, returns true if it is a valid total and false if it is not.
    //
    //Can you devise a solution that is more efficient than simply adding consecutive integers as I did above?
    //
    //Examples
    //pagesInBook(5) ➞ false
    //
    //pagesInBook(4005) ➞ true
    //
    //pagesInBook(9453) ➞ true

    public static boolean findPagesTotalInBook(int totalPages){
        int discriminant = 1+8*totalPages;

        double squareRootDiscriminant = Math.sqrt(discriminant);

        if(squareRootDiscriminant == (int) squareRootDiscriminant){
            double n = ((-1+squareRootDiscriminant)/2);
            if(n == (int)n){
                return true;
            }
        }

        return false;
    }
}
