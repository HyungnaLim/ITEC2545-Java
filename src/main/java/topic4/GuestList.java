package topic4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class GuestList {

    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();
        createList(guestList);
        printList(guestList);

        while (yesNoInput("Do you want to remove any guests?")) {
            if (guestList.isEmpty()) {
                System.out.println("There are no more guests to remove.");
                break;
            } else {
                int indexToRemove = positiveIntInput("Enter the index number of the guest to remove:");
                if (indexToRemove <= guestList.size()) {
                    String removedGuest = guestList.get(indexToRemove - 1);
                    guestList.remove(indexToRemove - 1);
                    System.out.println(removedGuest + " is removed.");
                    printList(guestList);
                } else {
                    System.out.println("Error - invalid index number");
                }
            }
        }

        System.out.println("\nThe total number of guest is " + guestList.size());
        System.out.println("Random prize goes to " + randomGuest(guestList));

    }


    public static void createList(List<String> list) {
        while (true) {
            String item = stringInput("Enter the name of a guest for guest list, or press Enter to quit");
            if (item.isEmpty()) {
                break;
            } else if (containsIgnoreCase(item, list)) {
                System.out.println(item + "is already in the list");
            }else {
                list.add(item);
                System.out.println(item + " is added to the list.");
            }
        }
        Collections.sort(list);
    }


    public static void printList(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("There are no guests in the list.");
        } else {
            System.out.println("Here is your guest list:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + 1 + " " + list.get(i));
            }
        }
        System.out.println();
    }


    public static boolean containsIgnoreCase(String data, List<String> list) {
        for (String itemInList : list) {
            if (itemInList.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }


    public static String randomGuest(List<String> list) {
        if (list.isEmpty()) {
            return "nobody";
        } else {
            Random randomNumberGenerator = new Random();
            int randomIndex = randomNumberGenerator.nextInt(list.size()); // from 0 to size-1 : match with indexing
            return list.get(randomIndex);
        }
    }


}
