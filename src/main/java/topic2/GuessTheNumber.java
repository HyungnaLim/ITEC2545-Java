package topic2;

import java.util.Random;

import static input.InputUtils.intInput;

public class GuessTheNumber {
    public static void main(String[] args) {

        // create a Random number generator object
        Random random = new Random();

        // generate a random number between 1 and 10
        int secretNumber = random.nextInt(10) + 1;

        int userGuess = intInput("Guess a number between 1 and 10 that the computer is thinking of:");

        // set while loop for incorrect numbers
        while (userGuess!=secretNumber) {
            // higher guess
            if (userGuess>secretNumber) {
                System.out.println("Wrong! The secret number is lower than " + userGuess + ". Try again.");
                userGuess = intInput("Guess a number between 1 and 10 that the computer is thinking of");
            }
            // lower guess
            else {
                System.out.println("Wrong! The secret number is higher than " + userGuess + ". Try again.");
                userGuess = intInput("Guess a number between 1 and 10 that the computer is thinking of:");
            }
        }

        // correct answer
        System.out.println("Correct! The secret number is " + secretNumber);

    }
}
