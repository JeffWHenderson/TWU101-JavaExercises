package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int counter; // no need for getters or setter yet

    public void increment() {
        counter++;
    }

    public void total() {
        System.out.print(counter);
    }
}
