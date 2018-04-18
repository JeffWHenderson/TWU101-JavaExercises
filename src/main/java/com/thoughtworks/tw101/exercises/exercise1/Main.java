package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        addOddNumbers();
        addOddNumbersWithRecursion(1, 100, 0);
    }


    public static void addOddNumbers() {
        int total = 0;
        int n = 1;
        while(n <= 100) {
            total += n;
            System.out.print(n + ", ");
            n += 2;
        }
        System.out.println("TOTAL: " + total);
    }

    public static void addOddNumbersWithRecursion(int start, int end, int total) {
        if(start < end) {
            System.out.print(start + ", ");

            total += start;
            start += 2;
            addOddNumbersWithRecursion(start, end, total);
        } else {
            System.out.println("TOTAL: " + total);
        }
    }
}
