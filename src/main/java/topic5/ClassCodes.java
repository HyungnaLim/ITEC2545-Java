package topic5;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {
        Map<Integer, String> classes = new HashMap<>();
        classes.put(2545, "Java");
        classes.put(1425, "Datacom");
        classes.put(2560, "Web");

        // print all the class codes and names
        for (Integer code : classes.keySet()) {
            System.out.println("ITEC " + code + " " + classes.get(code));
        }

        // print the number of classes
        System.out.println("You are taking " + classes.size() + " classes");

        // search using if-else statement
        int searchCode = 2417;
        if (classes.containsKey(searchCode)) {
            System.out.println("The class name for " + searchCode + " is " + classes.get(searchCode));
        } else {
            System.out.println("Not found");
        }

        // another way to search - using null
        int searchCode2 = 2545;
        if (classes.get(searchCode2) == null) {
            System.out.println("Not found");
        } else {
            System.out.println("The class name for " + searchCode2 + " is " + classes.get(searchCode2));
        }

        // another way to search - gerOrDefault method
        // if you only want to get the data (without formatting or other strings)
        System.out.println(classes.getOrDefault(searchCode2, "Not found"));

    }

}
