package topic6;

import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {

        // set variables
        String name = "Hyungna";
        String favColor = "Cream";
        int classCode = 2545;

        // create writer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("name.txt"));

        // write a file
        bufferedWriter.write("My name is " + name);
        bufferedWriter.newLine();
        bufferedWriter.write("My favorite color is " + favColor);
        bufferedWriter.newLine();
        bufferedWriter.write("The class code of java class is " + classCode);
        bufferedWriter.close(); // close file

        // create reader
        BufferedReader bufferedReader = new BufferedReader(new FileReader("name.txt"));

        // read file
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close(); // close file

    }
}
