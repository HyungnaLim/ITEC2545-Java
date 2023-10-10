package topic5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTrip {
    public static void main(String[] args) {

        // create a hashmap of distance from Mpls to other cities in MN
        Map<String, Integer> distanceToOtherCities = new HashMap<>();

        // add example data
        distanceToOtherCities.put("Duluth", 154);
        distanceToOtherCities.put("Brainerd", 127);
        distanceToOtherCities.put("Stillwater", 26);
        distanceToOtherCities.put("Ely", 245);
        distanceToOtherCities.put("Red Wing", 54);

        // asking for maximum distance
        int maxDistance = positiveIntInput("Enter the maximum distance you want to drive");

        // create new array list
        List<String> citiesInRange = new ArrayList<>();

        // search and print all the cities within the maximum distance
        for (String city : distanceToOtherCities.keySet()) {
            int distance = distanceToOtherCities.get(city);
            if (distance <= maxDistance) {
//                System.out.println(city + " is " + distance + " miles away");
                citiesInRange.add(city); // add the city within the range to the arraylist
            }
        }

        if (citiesInRange.isEmpty()) { // print message if there's no city within max distance
            System.out.println("Sorry, no cities are within the distance in our data");
        } else { // print all the city in the list
            System.out.println("Here are " + citiesInRange.size() + " cities you can drive to");
            for (String city : citiesInRange) {
                System.out.println(city);
            }
        }


    }
}
