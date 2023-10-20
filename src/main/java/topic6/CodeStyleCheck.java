package topic6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodeStyleCheck {
    public static void main(String[] args) {

        // resource handling
        try (BufferedReader reader = new BufferedReader(new FileReader("ReadNumberFromFile.java"));) {

            String line = reader.readLine();
            int maxLineLength = 50;

            // below is the code I tried
//            List<String> lines = new ArrayList<>();
//            while (line != null) {
//                lines.add(line);
//                line = reader.readLine();
//            }
//
//            for (int i = 0; i < lines.size(); i++) {
//                String s = lines.get(i);
//                if (s.length() > maxLineLength) {
//                    System.out.println("line " + (i+1) + " is longer than 100 characters");
//                }
//            }
//            System.out.println("End of the check");

            // this is the solution from lecture video
            boolean linesTooLong = false;
            int lineCounter = 1;
            int numberOfLinesTooLong = 0;

            while (line != null) {
                if (line.length() > maxLineLength) {
                    System.out.println("The line " + lineCounter + " is too long");
                    linesTooLong = true;
                    numberOfLinesTooLong++;
                }
                lineCounter++;
                line = reader.readLine();
            }

            // giving summary of the result
            if (linesTooLong) {
                System.out.println("There were " + numberOfLinesTooLong + " lines that were too long.");
            } else {
                System.out.println("There was no lines that were too long");
            }

        }
        catch (IOException ioe) { // handle IOException
            System.out.println("Can not read the file " + ioe);
        }
    }
}
