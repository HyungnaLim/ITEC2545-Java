package topic4;

import java.util.ArrayList;
import java.util.List;

public class AddingList {
    public static void main(String[] args) {

        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);
        classCodes.add(2);

        classCodes.add(0,1425); // add 1425 at the start of the list

        System.out.println(classCodes); // print the list with []
        System.out.println(classCodes.size()); // how many items in the list

        for (int classCode : classCodes) {
            System.out.println("ITEC " + classCode); // print each class code in a new line with "ITEC " using loop
        }

        classCodes.remove(2); // remove position of 2 or by value 2?
        System.out.println(classCodes); // position 2 is removed! it works with index, not an integer object

        // if you want to remove integer object 2, use this method
        classCodes.remove(Integer.valueOf(2));

    }
}
