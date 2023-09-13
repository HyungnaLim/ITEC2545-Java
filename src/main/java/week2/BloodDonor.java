package week2;

import static input.InputUtils.positiveDoubleInput;
import static input.InputUtils.positiveIntInput;

public class BloodDonor {
    public static void main(String[] args) {
        double weight = positiveDoubleInput("What is your weight in lb?");
        int age = positiveIntInput("What is your age?");

        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor.");
        } else {
                System.out.println("Sorry, You are not eligible.");
                if (weight < 110) {
                    System.out.println("You do not weigh enough. You must weigh 110lb or more.");
                }
                if (age < 17) {
                    System.out.println("You are not old enough. You must be 17 or more.");
                }
            }
        }
    }
