package topic6;

import java.util.List;

import static input.InputUtils.stringInput;

public class UserEntersData_WindowsVersion {
    public static void main(String[] args) {

        List<String> windowsVersions = List.of("XP", "7", "8", "9", "10", "11");
        // String.join() method put all the strings in the list in one string with specified seperator
        String windowsVersionsString = String.join(", ", windowsVersions); // XP, 7, 8, 9, 10, 11

        String userVersion = stringInput("Enter your version of Windows from these choices: " + windowsVersionsString).toUpperCase();

        // repeat the loop while the user input is invalid
        while (!windowsVersions.contains(userVersion)) {
            userVersion = stringInput("Not recognized version. Enter your version of Windows from these choices: "
            + windowsVersionsString).toUpperCase();
        }
        System.out.println("Thanks, your Windows version is " + userVersion);

    }
}
