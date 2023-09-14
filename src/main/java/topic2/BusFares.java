package topic2;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {

        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double totalBusFare = 0;

        // set a loop for asking bus fares
        for (int day=0; day<dayNames.length; day++) {
            double busFare = doubleInput("On " + dayNames[day] + ", " +
                    "what did you spend on bus fares?");
            // add up each bus fare to the total as the loop repeats
            totalBusFare += busFare;
        }

        // print the total bus fare in the end
        System.out.printf("For the week, you spent $%.2f for bus fares", totalBusFare);
    }
}
