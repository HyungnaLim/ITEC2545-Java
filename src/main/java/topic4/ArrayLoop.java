package topic4;

import java.util.ArrayList;
import java.util.List;

public class ArrayLoop {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming and Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concept");


        // use loop to print each item in a new line
        for (String className : classNames /*preferred way, less typing*/) {
            System.out.println(className);
//            classNames.remove(0);  // DO NOT MODIFY A LIST IN THE FOR LOOP! The program will crash
        }


        System.out.println();


        // works same as above, useful to know index as well as data
        for (int i=0; i<classNames.size(); i++) {
            System.out.println(i + " " + classNames.get(i));
            classNames.remove(0); // not crashing, but doesn't work as intended. So don't do it!
        }
        System.out.println(classNames);


        System.out.println();


        while (!classNames.isEmpty() /*until the list is not empty*/) {
            String name = classNames.remove(0); // remove the first item in the list
            System.out.println(name); // then print the value that has been removed
        }
        System.out.println(classNames);


        // use enhanced for loop
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Son"};
        for (String day : days) {
            System.out.println(day);
        }
    }
}