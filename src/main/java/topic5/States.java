package topic5;

import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {

        // HashMap syntax
        // Map is generic type, it includes HashMap, HashTable, TreeMap
        // using Map makes the code more generic, and it makes easy to switch to other type of Map
        Map<String /*type of keys*/, Integer/*type of value*/> name /*name of hashmap*/ = new HashMap<>();

        // create hashmap
        HashMap<String, String> stateAbbreviations = new HashMap<>();
        // if using double, use 'Double' with uppercase D, do not use primitive type 'double'

        // hashmap stores key-value pairs
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        // sometimes the order is rearranged by java
        // for hashmap, the association between key-value pair is important, not the order
        System.out.println(stateAbbreviations);

        // we can get the value by its key
        System.out.println(stateAbbreviations.get("Minnesota")); // this will print MN
        // but not vise versa

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);

        // loop over the key set
        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName); // print keys
            System.out.println(stateAbbreviations.get(stateName)); // print values for keys
        }

        // loop over the value
        for (String abbreviation : stateAbbreviations.values()) {
            System.out.println(abbreviation);
        }

        // loop over key-value pairs until value is found
        String searchAbbreviation = "MI"; // set a search term
        for (String stateName : stateAbbreviations.keySet()) { // looping over keys
            String abbreviation = stateAbbreviations.get(stateName); // look for values and set it as variable
            if (abbreviation.equals(searchAbbreviation)) { // if the value is equal to search term, print
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        // switching keys to values from existing hashmap
        Map<String, String> abbreviationStateNames = new HashMap<>(); // set a new empty hashmap
        for (Map.Entry<String, String> entry : stateAbbreviations.entrySet()) { // loop over entry (key-value pair)
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationStateNames.put(abbreviation, state);
        }
        System.out.println(abbreviationStateNames);

        // size method - how many entries in the hashmap
        System.out.println("There are " + stateAbbreviations.size() + " states listed");
    }
}
