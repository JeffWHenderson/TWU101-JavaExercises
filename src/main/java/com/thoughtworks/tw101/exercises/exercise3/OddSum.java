package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int total = 0;
        while(start <= end) {
            total += start;
            start += 2;
        }
        return total;
    }
}

/*
    // could use this math instead:
    // n/2  * (firstTerm + LastTerm)
    // 50/2 * (   1      +    99   )
*/