package topic4;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class JavaLists {
    public static void main(String[] args) {

        // There are 3 different types of list

        // ArrayList
        // most common list type, fast to search, fast to add/remove items at the end of the list
        // slower to add/remove items in the middle of the list
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");

        // LinkedList
        // made of nodes linked together, each node stores one list item and has link to before and after nodes
        // linkedlist knows where it starts and ends, but can't access the middle nodes directly
        // so always have to check from the beginning of the list
        // easy to fetch the first of last node, fairly fast to search, slower for larger lists
        // fast to add/remove items at the start or end, fairly fast to add items in the middle
        // better to use linkedList than arraylist when the program has to add/remove items in the middle of the lists
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");

        // Vector
        // thread-safe aka synchronized
        List<String> vector = new Vector<>();
        vector.add("Hello");


    }
}
