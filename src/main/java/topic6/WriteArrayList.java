package topic6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        // arraylist
        List<String> className = List.of("Java","Web","C#");
        List<Integer> classCode = List.of(2545, 2560, 2505);

        // declare final string variable for file name
        final String filename = "ITEC_Classes.txt";

        // writer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        // loop to write items in the arraylists in format
        for (int i=0; i<className.size(); i++) {
            String name = className.get(i);
            int code = classCode.get(i);
            bufferedWriter.write(String.format("ITEC %d %s\n", code, name));
        }

        // close file
        bufferedWriter.close();

        // reader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        // create an empty arraylist
        List<String> classDescriptions = new ArrayList<>();

        String line = bufferedReader.readLine();

        // add each line in the file to the list until the loop gets to the end of the file
        while (line!=null) {
            classDescriptions.add(line);
            line = bufferedReader.readLine();
        }
        System.out.println("End of file reached");

        // print the list
        System.out.println(classDescriptions);

    }
}
