package topic3;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {

        //print a list of number in order
        int smallNumber = intInput("Enter a small number");
        int largeNumber = intInput("Enter a large number");

        System.out.println("I will count from " + smallNumber + " to " + largeNumber);

        count(smallNumber, largeNumber);
    }

    public static void count(int min, int max) { // void method does not return anything, just execute the code
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
}
