package topic2;

import static input.InputUtils.stringInput;

public class WhileLoopPassword {
    public static void main(String[] args) {

        String secretPassword = "kittens";

        String userPassword = stringInput("Enter the password");

        int maxGuesses = 5;

        // while the loop condition in () is true, repeat things in {}
        // only give user 5 chances to get the password right
        while ( !userPassword.equals(secretPassword) && maxGuesses>1 ) {
            System.out.println("Password incorrect, access denied!");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password");
            maxGuesses--;
        }

        // if the loop condition is false
        if (maxGuesses>1) {
            System.out.println("Correct password - access granted!");
            // TODO - top secret program here
        }
        else {
            System.out.println("Max number of password attempts.");
            System.exit(0); // stop the program
        }

    }
}
