package topic1;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

public class HelloInput {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String userName = stringInput("Please enter your name: ");
        System.out.println("Welcome, " + userName + "!");

        int howManyClasses = positiveIntInput("How many classes are you taking this semester?");
        // input util recognize the type of input and print error messages if it is not correct.

        String units = "classes";

        if (howManyClasses == 1) {
            units = "class";
        }

        System.out.println("You are taking " + howManyClasses + " " + units + " this semester.");
        // formatted version
        System.out.printf("You are taking %d %s this semester.", howManyClasses,units);
    }
}
