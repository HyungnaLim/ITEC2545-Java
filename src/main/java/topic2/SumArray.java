package topic2;

public class SumArray {
    public static void main(String[] args) {

        // create array
        double numbers[] = new double[3];
        numbers[0] = 45.3467;
        numbers[1] = -13.74432;
        numbers[2] = 0.00005;

        // set start point to add up data
        double sum = 0;

        // adding up all the data using loop
        for (int x = 0; x < numbers.length; x++) {
            sum += numbers[x];
        }

        // calculate the average of numbers
        double average = sum / numbers.length;

        // print the total sum and average
        System.out.println("Total of numbers = " + sum);
        System.out.println("Average of numbers = " + average);

    }
}
