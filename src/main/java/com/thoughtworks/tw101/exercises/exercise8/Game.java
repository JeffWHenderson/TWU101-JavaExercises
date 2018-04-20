package com.thoughtworks.tw101.exercises.exercise8;

public class Game {
    private boolean isRunning = true;
    private int randomNumber;

    public void start() {
        UserInput userInput = new UserInput(this);
        startGameMessage();

        while (isRunning) {
            generateRandomNumber();   //System.out.println(randomNumber + " <-- THE RANDOM NUMBER "); /* UNCOMMENT THE SYSTEM.OUT TO SEE WHAT RANDOM NUMBER IS FOR DEBUGGING. */

            System.out.println("Please guess a number 1-100");
            userInput.collectUserInput(randomNumber);
        }
    }

    private int generateRandomNumber() {
        randomNumber =  (int) (Math.random() * 100);
        return randomNumber;
    }

    private void startGameMessage() {
        System.out.println("enter 'quit' to end game");
    }

    public void setIsRunningFalse() {
        System.out.println("GOODBYE");
        isRunning = false;
    }
}
