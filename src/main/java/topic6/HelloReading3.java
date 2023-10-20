package topic6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading3 {
    public static void main(String[] args) {

        String filename = "no.txt"; // try with not existing file name

        // try with resource - the resource will be automatically closed in the end of the code
        // so whether the code runs try block or catch block, the file will be closed
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
//            line = line.toUpperCase(); // this will cause NullPointerException
        }
        catch (IOException ioe) { // only runs if IOException is thrown
            System.out.println("Sorry, error or file not found." + ioe);
        }
    }
}
