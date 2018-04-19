package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isRunning = true;
        int randomNumber;
        int userGuess;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 0 to exit");

        while (isRunning) {
                randomNumber =  (int) (Math.random() * 100);
                System.out.println("Please guess a number 1-100");

                userGuess = scanner.nextInt();

                if(userGuess > randomNumber)
                    System.out.println("You Guessed too high");
                else if(userGuess < randomNumber)
                    System.out.println("You Guessed too low");
                else {
                    isRunning = false;
                    System.out.println("you win!");
                }


                if(userGuess == 0) // just an easy exit strategy.
                    isRunning = false;

        }

    }
}
