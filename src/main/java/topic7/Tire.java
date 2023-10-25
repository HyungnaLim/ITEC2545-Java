package topic7;

public class Tire implements Comparable<Tire> {
    // to enable Collection.sort, make the Tire object comparable

    private String name;
    private double price;
    private int warrantyMiles;

    public Tire(String name, double price, int warrantyMiles) {
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double pricePer1000Miles() {
        double pricePer1000 = ( this.price / warrantyMiles ) * 1000;
        return pricePer1000;
    }

    public double costForSet() {
        return this.price * 4;
    }


    @Override
    public String toString() {
        double pricePer1000 = pricePer1000Miles();
        double costForSet = costForSet();
        return String.format("%s costs $%.2f per tire. " +
                "Price per 1000 miles is $%.2f. " +
                "Price for four set is $%.2f", this.name, this.price, pricePer1000, costForSet);
    }

    @Override
    public int compareTo(Tire anotherTire) {
        // sort by pricePer1000Miles (cheapest first)
        return Double.compare(this.pricePer1000Miles(), anotherTire.pricePer1000Miles());

        // sort by name (alphabetical order)
        // return this.name.compareTo(anotherTire.name);
    }
}
