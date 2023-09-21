package topic3;

import static input.InputUtils.intInput;

public class Credits {
    public static void main(String[] args) {

        // get credit int value from user
        int creditsEarned = intInput("How many credits have you earned?");
        int creditsForGraduate = intInput("How many credits do you need to graduate?");

        // get credits needed from howManyCreditToGraduate method using creditsEarned and creditsForGraduate
        int creditsNeeded = howManyCreditsToGraduate(creditsEarned, creditsForGraduate);

        // print the result
        System.out.println("You need to earn " + creditsNeeded + " more credits to graduate!");

    }

    public static int howManyCreditsToGraduate(int creditsEarned, int creditsForGraduate) {
        // this method calculate how many credits are needed to graduate
        int creditsNeeded = creditsForGraduate - creditsEarned;
        return creditsNeeded;
    }
}
