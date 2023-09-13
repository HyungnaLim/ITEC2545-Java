package topic1;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {

        String college = stringInput("Which college do you attend?");

        // use .equals() method to compare string variable.
        // to make it not case-sensitive, use .equalsIgnoreCase() method
        if (college.equals("MCTC")) {
            System.out.println("Yay, MCTC!");
        } else {
            System.out.println("Too bad, you should check out MCTC.");
        }

    }
}
