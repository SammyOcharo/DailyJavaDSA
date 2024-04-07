package com.dev.DSA;

public class PrimeNumbers {
    //How Many "Prime Numbers" Are There?
    //Create a function that finds how many prime numbers there are, up to the given integer.
    //
    //Examples
    //primeNumbers(10) ➞ 4
    //// 2, 3, 5 and 7
    //
    //primeNumbers(20) ➞ 8
    //// 2, 3, 5, 7, 11, 13, 17 and 19
    //
    //primeNumbers(30) ➞ 10
    //// 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29


    public static boolean isPrime(int number){

        if(number <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static int primeNumbers(int number){
        int primeCount = 0;
        for(int i=2; i <= number; i++){
            if(isPrime(i)){
                primeCount +=1;
            }
        }

        return primeCount;
    }
}
