package topic3;

import java.util.Arrays;

public class PassByValue {
    public static void main(String[] args) {

        int miles = 6;
        changeToKM(miles);
        System.out.println(miles); // this is still 6

        String units = "miles";
        changeToMetricUnits(units);
        System.out.println(units); // this is still "miles"

        // Pass by value :
        // when passing primitive types (int, double, boolean, String) to methods, a copy is made
        // you have to return the modified data from the method to affect the main data!
        // the original value does not change if you don't return
        // this is because they save primitive types and objects in different parts of memory
        // primitive type values are stored in stack part of the memory

        double[] speeds = {4, 5, 10, 12};
        convertToKilometers(speeds);
        System.out.println(Arrays.toString(speeds)); // this prints out modified array!

        // Arrays are objects (more complex and larger size)
        // objects are stored in heap part of the memory (larger space)
        // References of objects are made to help finding and dealing objects more easily, and stored in stack
        // References are address of each object, made of number value
    }

    private static void changeToKM(int distance) {
        distance = 10;
        // return distance, change void -> int
    }

    private static void changeToMetricUnits(String units) {
        units = "kilometers";
        // return units, change void -> String
    }

    // keep the method name descriptive especially when it modifies one of its arguments!

    private static void convertToKilometers(double[] speeds) {
        for (int i = 0; i < speeds.length; i++) {
            double speed = speeds[i];
            double speedKm = speed * 1.6;
            speeds[i] = speedKm; // the original values in the array is modified
        }
    }
}
