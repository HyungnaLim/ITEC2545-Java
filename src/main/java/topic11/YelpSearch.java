package topic11;

import kong.unirest.Unirest;

import java.util.Map;

import static input.InputUtils.stringInput;

public class YelpSearch {

    public static void main(String[] args) {
        String yelpURL = "https://api.yelp.com/v3/businesses/search";

        // set environment key for API KEY in advance
        final String YELP_API_KEY = System.getenv("YELP_API_KEY"); // get the environment key

        // ask user for type of restaurant to search
        String typeOfRestaurant = stringInput("What type of restaurant would you like to search for?");

        // query to look for cheap restaurants near Minneapolis
        Map<String, Object> yelpQuery = Map.of(
                "term", typeOfRestaurant, // type of restaurant
                "location", "Minneapolis, MN",
                "categories", "restaurants",
                "price", "1"); // lowest price

        YelpResponse response = Unirest.get(yelpURL)
                .header("Authorization", "Bearer " + YELP_API_KEY)
                .queryString(yelpQuery)
                .asObject(YelpResponse.class)
                .getBody();

        System.out.println(response);

        for (Business b : response.businesses) {
            System.out.println(b.name);
            System.out.println(b.location.address1 + ", " + b.location.city);
            System.out.println("Rating: " + b.rating + "\n");
        }

    }

}
