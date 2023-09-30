package topic4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String/*generic type*/> listName = new ArrayList<>();
        // it should specify the type of data you want to store in <> - String, Integer, Boolean, Double
        listName.add("Hello");
        listName.add("World");
        listName.add("Hyungnma");
        listName.add("MCTC");

        String firstword = listName.get(0);
        System.out.println(firstword);

        for (String s: listName) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }

    }
}
