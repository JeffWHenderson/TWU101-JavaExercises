package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    private static List<Integer> primes;

    public static void main(String[] args) {
        generate(1);
        List<Integer> primeFactors = generate(30);

        System.out.print(primes.toString());
    }

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<Integer>();

        generate(n, primeFactors);

        return primeFactors;
    }

    private static void generate(int n, List<Integer> primeFactors) {
        if(n % 2 == 0) {
            primeFactors.add(2);
            generate(n / 2, primeFactors);
        }
        else if(n % 3 == 0) {
            primeFactors.add(3);
            generate(n / 3, primeFactors);
        }
        else if(n % 5 == 0) {
            primeFactors.add(5);
            generate(n / 5, primeFactors);
        }
        primes = primeFactors;
    }
}
