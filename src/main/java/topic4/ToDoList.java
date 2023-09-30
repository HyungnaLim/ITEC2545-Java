package topic4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ToDoList {
    public static void main(String[] args) {

        // set a string array list
        List<String> todoList = new ArrayList<>();

        while (true) {
            // ask for task to do and set it as variable
            String task = stringInput("Please type a task you need to do, or press Enter to quit");
            if (task.isEmpty()) { // if it is an empty value, break and end the loop
                break;
            }
            else if (containsIgnoresCase(todoList, task)) {
                System.out.println(task + " is already in the list");
            } else {
                todoList.add(task); // if not, add the data into the list
            }
        }

        System.out.println("Thank you, here are all of your tasks you entered:");

        // print everything in the list with an enhanced for loop
        for (String input : todoList) {
            System.out.println(input);
        }

        System.out.println("The total number of task : " + todoList.size());
    }

    public static boolean containsIgnoresCase(List<String> list, String data) {
        for (String item : list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }


}
