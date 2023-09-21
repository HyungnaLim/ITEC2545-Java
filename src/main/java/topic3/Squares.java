package topic3;

import static input.InputUtils.doubleInput;

public class Squares {
    public static void main(String[] args) {
        double number = doubleInput("Please enter a number and I'll square it");
        double squared = square(number); // use square method to calculate
        System.out.println("The square of " + number + " is " + squared); // print the result
    }

    private static double square(double num) { // this method calculate square of number and return the double value
        double square = num * num; // calculate the square of the num
        return square;
    }
    // print things from methods can be useful if the point of the method is to print things
    // the method should have one focused task to be more reusable
    // ex. if the purpose is doing the math,
    // do the math and not print the result as well in the same method, just return the result

}
