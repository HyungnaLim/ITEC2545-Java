package topic4;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {

        // List.of - when you want to add things directly as creating a list
        List<String> animals = List.of("Cat", "Dog", "Bird");
        System.out.println(animals);

        // but you can't modify the list with List.of method
//        animals.remove("Frog");

    }
}
