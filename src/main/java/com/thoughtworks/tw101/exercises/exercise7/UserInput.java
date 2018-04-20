package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class UserInput {
    private String userGuess;
    private Scanner scanner = new Scanner(System.in);
    private Game game;

    public UserInput(Game game) {
        this.game = game;
    }

    public void collectUserInput(int randomNumber) {
        userGuess = scanner.nextLine();

        handleUserInput(userGuess, randomNumber, game);
    }

    private void handleUserInput(String userGuess, int randomNumber, Game game) {
        if (userGuess.equals("quit"))
            game.setIsRunningFalse();
        else
            testInputAgainstRandomNumber(randomNumber);
    }

    private void testInputAgainstRandomNumber(int randomNumber) {
        int userGuessAsInt = Integer.parseInt(userGuess);

        if (userGuessAsInt > randomNumber)
            System.out.println("You Guessed too high");
        else if (userGuessAsInt < randomNumber)
            System.out.println("You Guessed too low");
        else {
            System.out.println("you win!");
            game.setIsRunningFalse();
        }
    }
}
