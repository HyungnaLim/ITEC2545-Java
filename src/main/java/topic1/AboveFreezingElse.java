package topic1;

import static input.InputUtils.doubleInput;

public class AboveFreezingElse {
    public static void main(String[] args) {

        double temp = doubleInput("Enter today's temperature in F");

        //Indentation in if block is optional but strongly suggested for readability
        if (temp > 32) {
            //This will run if the condition is true
            System.out.println("It's above freezing");
        } else {
            // This will run if the condition is not true
            System.out.println("It's below freezing");
        }
    }
}
