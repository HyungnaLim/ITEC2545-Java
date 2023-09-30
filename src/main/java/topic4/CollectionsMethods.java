package topic4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming and Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concept");

        System.out.println(classNames);

        // shuffle - random order
        Collections.shuffle(classNames);
        System.out.println(classNames);

        // sort into order - according to the code
        Collections.sort(classNames);
        System.out.println(classNames);

        // min - works with alphabetical order for letter or numeric order for number
        String alphabeticalFirst = Collections.min(classNames);
        System.out.println(alphabeticalFirst);

        // max
        String alphabeticalLast = Collections.max(classNames);
        System.out.println(alphabeticalLast);

    }
}