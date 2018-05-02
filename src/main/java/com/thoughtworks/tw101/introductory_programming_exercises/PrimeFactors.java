package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    private static List<Integer> primes = new ArrayList();

    public static void main(String[] args) {
        generate(30);
        generate(1);
        generate(100);
    }

    private static void generate(int n) {
        int originalNumber = n;
        primes.clear();

        for(int i = 2; i < n; i++) {
            while(n % i == 0) {
                primes.add(i);
                n /= i;
            }
        }
        if(n != 1)
            primes.add(n);

        printPrimeMessage(originalNumber);
    }

    private static void printPrimeMessage(int originalNumber) {
        System.out.println("Primes for " + originalNumber + ": " + primes.toString());
    }

}
