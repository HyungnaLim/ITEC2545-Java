package topic5;

import java.util.HashMap;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {

        HashMap<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        System.out.println(snowfall);

        // print hashmap data one entry per line
        for (String month : snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.printf("The snowfall in %s was %.2f inches\n", month, snow);
        }

        snowfall.put("February", 12.4); // overwrite data


        // asking for adding data
        boolean addMore = yesNoInput("Do you want to add more snowfall data?");

        // set a loop to add data
        while (addMore) {
            String newMonth = stringInput("Enter the name of month");
            if (snowfall.containsKey(newMonth)) {
                boolean overwriteData = yesNoInput("The hashmap already contains " + newMonth +
                        ". Do you want to overwrite?");
                if (overwriteData) {
                    double newSnow = positiveDoubleInput("Enter the number of inches of snowfall in " + newMonth);
                    snowfall.put(newMonth, newSnow);
                } else {
                    System.out.println("Okay, data was not overwritten.");
                }
            }
            addMore = yesNoInput("Do you want to add more snowfall data?");
        }

        // print the hashmap
        System.out.println(snowfall);


        // calculate total snowfall
        double snowTotal = 0;
        for (double snow : snowfall.values()) {
            snowTotal += snow;
        }
        System.out.println("The total snowfall is " + snowTotal + " inches");


        // if the hashmap doesn't contain data, it will show null
        System.out.println("The snow in January is " + snowfall.get("January") + " inches");
        System.out.println("The snow in July is " + snowfall.get("July") + " inches");


        // if-else statement using hashmap.containKey method
        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July!");
        } else {
            System.out.println("There was no snow in July");
        }
    }
}
