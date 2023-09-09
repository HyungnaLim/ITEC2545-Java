package week1;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");

        // does the user live more than 10 miles away?
        if (miles > 10) {
            System.out.println("You live more than 10 miles away.");
        } else if (miles < 10) {
            System.out.println("You live less than 10 miles away.");
        } else {
            System.out.println("You live exactly 10 miles away.");
        }

        // convert miles to km
        double km = miles * 1.6;
        System.out.printf("You live %.2f kilometers from school.", km);

    }
}
