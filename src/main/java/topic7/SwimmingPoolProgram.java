package topic7;

public class SwimmingPoolProgram {
    public static void main(String[] args) {

        // create pool object
        Pool ymca = new Pool("ymca", 50);

        // use method
        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance is " + totalSwam + " meters");

        // create another pool object
        Pool como = new Pool("Como Park", 25);
        System.out.println(como.distanceForLaps(10));

        // without toString method in the class definition,
        // this will print memory address for pool object (ex. topic7.Pool@12edcd21")
        System.out.println(como);

        // practice
        Pool edina = new Pool("Edina", 50);
        double totalDistance = edina.distanceForLaps(12);
        System.out.println(totalDistance);
        System.out.println(edina);


    }
}
