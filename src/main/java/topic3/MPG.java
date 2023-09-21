package topic3;

import static input.InputUtils.doubleInput;

public class MPG {
    public static void main(String[] args) {

        // ask miles and gas ued on a journey
        double miles = doubleInput("Enter a number of miles driven");
        double gas = doubleInput("Enter a number of gallons of gas used on a car journey");

        // get the mpg value from CalculateMPG method
        double mpg = CalculateMPG(miles, gas);

        // print the result
        System.out.println("The MPG for this journey is " + mpg);
    }

    private static double CalculateMPG(double miles, double gas) {
        // this method calculate the mpg and return it
        double mpg = miles / gas;
        return mpg;
    }
}
