package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    private String userGuess;
    private Scanner scanner = new Scanner(System.in);
    private Game game;
    private int randomNumber;
    private ArrayList<String> guesses = new ArrayList<String>();

    public UserInput(Game game) {
        this.game = game;
    }

    public void collectUserInput(int randomNumber) {
        userGuess = scanner.nextLine();
        this.randomNumber = randomNumber;

        this.guesses.add(userGuess);
        handleUserInput(userGuess, game);
    }

    private void handleUserInput(String userGuess, Game game) {
        try{
            int userGuessAsInt = Integer.parseInt(userGuess);
            testInputAgainstRandomNumber(userGuessAsInt);
        }catch(NumberFormatException e) {
            if(userGuess.equals("quit"))
                game.setIsRunningFalse();
            else {
                System.out.println("INPUT MUST BE A NUMBER OR 'QUIT' TO EXIT");
                collectUserInput(randomNumber);
            }
        }
    }

    private void testInputAgainstRandomNumber(int userGuessAsInt) {
        if (userGuessAsInt > randomNumber)
            System.out.println("You Guessed too high");
        else if (userGuessAsInt < randomNumber)
            System.out.println("You Guessed too low");
        else {
            System.out.println("Your Guesses were: " + guesses.toString());
            System.out.println("you win!");
            game.setIsRunningFalse();
        }
    }
}
