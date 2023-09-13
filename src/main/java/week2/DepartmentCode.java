package week2;

import static input.InputUtils.stringInput;

public class DepartmentCode {
    public static void main(String[] args) {

        String departmentcode = stringInput("Enter department code");

        // check for valid code; ITEC, ENGL, MATH ...
        if (departmentcode.length() == 4) {
            System.out.println("The code is valid.");
            // convert the code to upper case
            departmentcode = departmentcode.toUpperCase();
            System.out.println("The code is " + departmentcode);
        } else {
            System.out.println("The code is not valid.");
        }
    }
}
