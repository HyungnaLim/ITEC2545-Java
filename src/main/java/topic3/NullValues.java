package topic3;

import java.util.ArrayList;
import java.util.List;

public class NullValues {
    public static void main(String[] args) {

        // object types can have the value null, primitive types can't
        // a null object is not the same as empty object
        List<String> myList = null; // no list - no container, nothing to put data in
        List<String> emptyList = new ArrayList<>(); // an empty list, we can add data


        String name = null; // we can create a variable and set it to null (when data is unknown), no string at all
        System.out.println(name); // not an error, this will print null
//      System.out.println("The name " + name + " has " + name.length() + " letters");
//      this will cause Null Pointer Exceptions error - this happens when you use object.method() with null value
        nullCheckForName(name); // call a null check method to prevent error

        name = "Hyungna"; // we can set a value later
        System.out.println(name); // this will print Hyungna
        nullCheckForName(name);

        String emptyName = ""; // empty string
        System.out.println(emptyName); // not an error, this will print empty line
        nullCheckForName(emptyName);
    }

    private static void nullCheckForName(String name){
        if (name == null) {  // check if the variable is null to prevent Null Pointer Exceptions error
            System.out.println("There is no name");
        }
        else {
            System.out.println("The name " + name + " has " + name.length() + " letters");
        }
    }
}