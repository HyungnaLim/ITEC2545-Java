package topic3;

import static input.InputUtils.*;

public class Tires {
    public static void main(String[] args) {

        int numberOfTiresToCompare = positiveIntInput("How many tires do you want to compare?");
        String[] reports = new String[numberOfTiresToCompare];

        for (int i = 0; i < numberOfTiresToCompare; i++) {
            String report = getTireInfo();
            reports[i] = report;
        }

        printReportTable(reports);
    }

    private static void printReportTable(String[] reports) {
            for (int i = 0; i < reports.length; i++ ) {
                System.out.println(reports[i]);
            }
        }

    public static String getTireInfo() {

        String tireName = stringInput("What is the name of the tire?");
        double price = doubleInput("Enter the price for " + tireName);
        double miles = doubleInput("Enter warranty miles for " + tireName);
        double pricePerThousandMile = price / miles * 1000;
        return "The " + tireName + " tire costs " + pricePerThousandMile + " dollars per thousand miles";

    }
}
