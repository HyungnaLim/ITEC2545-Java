package week2;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {

        // This program checks if a student is dressed safely for welding

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-toe shoes?");

        // put parenthesis to group condition
        if ((cottonClothes || woolClothes) && closedToeShoes) {
            System.out.println("You are dressed safely for welding.");
        } else {
            System.out.println("You are not dressed safely.");
            if (! cottonClothes && ! woolClothes) {
                System.out.println("You must wear either cotton or wool clothes.");
            }
            if (! closedToeShoes) {
                System.out.println("You must wear closed-toe shoes.");
            }
        }

    }
}
