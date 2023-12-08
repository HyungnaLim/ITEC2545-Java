package topic11;


// Yelp API response classes to map the JSON to JAVA

public class YelpResponse {

    // field for businesses - array
    public Business[] businesses;

}

class Business {
    // represent one business object
    public String name;
    public double rating;
    public String price;
    public Location location; // nested object
}


class Location {
    public String city;
    public String address1;
}