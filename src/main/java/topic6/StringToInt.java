package topic6;

public class StringToInt {
    public static void main(String[] args) {

        String hopeThisIsANumber = "cat";

        try { // try block - what we want to do
            int number = Integer.parseInt(hopeThisIsANumber);
            System.out.println("The number is " + number);
        } catch (NumberFormatException e) { // catch block - do this instead if the specified exception error happens
            System.out.println( hopeThisIsANumber + " is not a valid integer string.");
        }

        System.out.println("This is the end of program");

    }
}
