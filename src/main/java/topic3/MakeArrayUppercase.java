package topic3;

import java.util.Arrays;

public class MakeArrayUppercase {
    public static void main(String[] args) {
        // set a String array
        String[] lowercase = {"ikea", "at&t", "cvs", "3m"};

        // call method to convert the array to uppercase
        makeArrayUppercase(lowercase);

        // print out the array
        System.out.println(Arrays.toString(lowercase));
    }

    public static void makeArrayUppercase(String[] StringArray) {
        // set a for loop to convert each string in array to uppercase
        for (int i=0; i<StringArray.length; i++) {
            StringArray[i] = StringArray[i].toUpperCase();
        }
    }
}
