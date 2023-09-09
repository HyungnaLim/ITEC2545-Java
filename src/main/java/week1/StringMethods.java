package week1;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        // length
        String  sampleWord = "cat";
        int numberOfCharacters = sampleWord.length();
        System.out.println(numberOfCharacters);

        // lowercase
        String sampleLower = sampleWord.toLowerCase();
        System.out.println(sampleLower);

        // uppercase
        String sampleUpper = sampleWord.toUpperCase();
        System.out.println(sampleUpper);

        // ends with
        String email = "hyungnalim@gmail.com";
        System.out.println(email.endsWith(".com"));

        // starts with
        System.out.println(email.startsWith("a"));

        // contains
        System.out.println(email.contains("@"));

        // split sentence into words & make an array of string
        String sentence = "My name is Hyungna Lim.";
        String[] words = sentence.split(" ");  // it will split words by space
        System.out.println(Arrays.toString(words));
        // find the first word in the array
        String firstWord = words[0];
        System.out.println(firstWord);

        String javaIDEs = "inteliJ,Eclipse,NetBeans,Notepad++,VSCode";
        String[] IDEs = javaIDEs.split(",");
        System.out.println(Arrays.toString(IDEs));
        for (int x = 0 ; x < IDEs.length ; x++) {
            System.out.println(IDEs[x]);
        }

        // trim - remove whitespace (spaces, tabs, newlines) start and end of a string
        String address = "  3321 Mckinley st. NE    Minneapolis Minnesota   ";
        System.out.println(address.trim());

        // format string
        // string %s, int %d, double %f
        // to specify decimal places for double : %.(number of decimal place)f
        String className = "Java Programming";
        double credits = 6.0;
        int studentsEnrolled = 24;
        String format = "Online";
        System.out.printf("The %s is %.1f credits, delivered %s, there are %d students enrolled.",
                className, credits, format, studentsEnrolled);

    }
}
