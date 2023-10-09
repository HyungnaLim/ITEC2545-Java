package topic5;

import java.util.HashMap;

public class States {
    public static void main(String[] args) {

        // create hashmap
        HashMap<String, String> stateAbbreviations = new HashMap<>();

        // hashmap stores key-value pairs
        // sometimes the order is rearranged by java but it won't matter
        // because the association between key-value pair is important, not the order
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        // we can get the value by its key
        System.out.println(stateAbbreviations.get("Minnesota")); // this will print MN
        // but not vise versa

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);

    }
}
