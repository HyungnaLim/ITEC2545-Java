package topic6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException /* avoid FileNotFoundException error*/ {

        // FileReader can open, close, and read the file character by character
        FileReader reader = new FileReader("hello.txt");

        // BufferedReader provides readLine method
        // it collects all the character from one line and put them together into a String, and return the string
        BufferedReader bufferedReader = new BufferedReader(reader);

        // you can create both FileReader and BufferedReader in this way
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("hello.txt"));

        // to read an entire file, use a while loop that repeats while readLine() != null
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        // shorter code to read the entire file
        String line2;
        while ((line2 = bufferedReader2.readLine()) != null) {
            System.out.println(line2);
        }
        bufferedReader2.close();

    }
}
