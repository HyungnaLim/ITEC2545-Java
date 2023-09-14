package topic2;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopGetDataForArray {
    public static void main(String[] args) {

        String[] textbooks = new String[5];

        for (int number = 0; number < textbooks.length ; number++) {

            // get data about one book from user
            String bookName = stringInput("Please enter name of texkbook");

            // using the loop counter to write to each array element in turn
            textbooks[number] = bookName;
        }

        System.out.println("Thank you: here is the data you entered");

        // print the array
        System.out.println(Arrays.toString(textbooks));

        // print all the elements from array in new lines using loop
        for (int number = 0; number< textbooks.length; number++) {
            System.out.println(textbooks[number]);
        }

        // print all the elements with formatting
        for (int number=0; number< textbooks.length; number++) {
            System.out.println("Book number " + (number+1) + " is " + textbooks[number]);
            // put extra () for calculation, otherwise it will just add 1 in the end of the index, like 01,11,21 ...
        }

    }
}
