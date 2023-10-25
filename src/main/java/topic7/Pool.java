package topic7;

public class Pool {

    // this is a class definition

    // instance variables (fields)
    // can add other attributes
    private String name; // field (variable)
    private double length; // another field

    // constructor - used to set up and initialize the object
    // This will allow us to create a pool object in our code
    // It must have the same name as the class
    Pool (String poolName, double poolLength) {
        name = poolName;
        length = poolLength;
    }

    // instance method to calculate the distance for laps
    // instance is another word for an object, an instance of a class
    // Pool object is an instance of the Pool class
    public double distanceForLaps(int laps) {
        double total = laps * length;
        return total;
    }

    // another instance method
    @Override // to replace the default toString() method to what you want
    public String toString() {
        // to avoid confusion, add this. to the variable
        // but if there's no possible conflict it works fine without this.
        String description = this.name + " pool is " + this.length + " meters long.";
        return description;
    }



}
