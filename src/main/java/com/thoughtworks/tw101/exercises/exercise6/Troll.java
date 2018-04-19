package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    @Override
    public void takeDamage(int amount) {
        System.out.println("need hp variable and subtract damage taken");
    }

    @Override
    public void reportStatus() {
        System.out.println("prints name and current hp");
    }
}
