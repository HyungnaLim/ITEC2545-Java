package topic3;

public class Marathon {
    public static void main(String[] args) {

        System.out.println("5% increase every week");
        calculateDistance(1.05);
        System.out.println();
        System.out.println("10% increase every week");
        calculateDistance(1.1);
    }

    public static void calculateDistance(double increaseRate) {
        double currentDistance = 1;
        double targetDistance = 26.2;
        int week = 1;

        // loop while current distance is less than target distance, stop when current distance exceed target distance
        while (currentDistance < targetDistance) {
            System.out.printf("week %d - %.2f miles%n", week, currentDistance); // print the week & distance
            currentDistance = currentDistance * increaseRate; // calculate increased distance for next week
            week++; // increase 1 for week counting
        }
        // print the last week data
        System.out.printf("week %d - %.2f miles%n", week, currentDistance);
    }
}
