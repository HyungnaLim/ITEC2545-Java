package topic4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming and Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concept");

        System.out.println(classNames);

        classNames.remove("Project Management"); // removing with string object, it has to be the exact same
        System.out.println(classNames);

        boolean wasRemoved = classNames.remove("Info Tech Concept"); // check if the object is removed with boolean
        System.out.println(classNames + " " + wasRemoved);

        classNames.remove("Precalculus"); // is the object is not there, nothing will happen
        System.out.println(classNames);

        classNames.remove(0); // removing with index (int primitive type)
        System.out.println(classNames);

        classNames.set(0, "Systems Analysis"); // change the value of object with index 0
        System.out.println(classNames);

        // contains method - check if certain value is in the list
        String search = "C# Programming";
        if (classNames.contains(search)) {
            System.out.println("The list contains " + search);
        } else {
            System.out.println("The list does NOT contain " + search + ". Now it is added to the list");
            classNames.add(search);
        }
        System.out.println(classNames);
        System.out.println(classNames.contains(search)); // returns boolean

        classNames.clear(); // clear method - makes the list empty
        System.out.println(classNames);
        System.out.println(classNames.size());

    }
}
