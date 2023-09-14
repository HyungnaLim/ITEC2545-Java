package topic2;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        // example int array
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
//        numbers[5] = 3; not a valid index. Array index starts at 0, so the last item is array size -1

        String[] classNames = new String[5];
        classNames[0] = "Java";
        classNames[1] = "C#";
        classNames[2] = "Web";
        classNames[3] = "Android";
        classNames[4] = "iOS";
        System.out.println("You should take " + classNames[1] + " class to graduate.");

        // create array with {}
        String[] animmals = { "cat", "dog", "bird" };
        System.out.println("My favorite animal is " + animmals[0]);

        String[] classrooms = {"T3010", "T3020", "T3030", "T3040", "T3050", "T3080"};
        // how many elements in the array? .length method
        int numberOfClassrooms = classrooms.length;
        System.out.println("There are " + numberOfClassrooms + " classrooms.");

        // use loop to print all the data from the array
        for (int x=0; x<numberOfClassrooms; x++) {
            System.out.println(classrooms[x]);
        }

        // print all the data from the array using .length method
        for (int x=0; x<classNames.length; x++) {
            System.out.println("MCTC offers " + classNames[x] + " class.");
        }

        // to print the array
        System.out.println(classNames); // this is not useful to print out the array
        System.out.println(Arrays.toString(classNames)); // this works! it will show all the data in []

        // practice printing array using for loop and length method
        String[] fall2023classes = {"ITEC1375", "ITEC2545", "ENGL1111", "MATH1120"};
        for (int x=0; x<fall2023classes.length; x++) {
            System.out.println("I am taking " + fall2023classes[x] + " this semester.");
        }


    }
}
