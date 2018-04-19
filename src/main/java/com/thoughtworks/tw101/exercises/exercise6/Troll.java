package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int hp = 40;
    private String name = "Troll";

    @Override
    public void takeDamage(int amount) {
        hp -= amount / 2;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + ": " + hp + "hp");
    }
}
