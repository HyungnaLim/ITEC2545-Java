package topic6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // string argument - will print as it is
        bufferedWriter.write("string\n");

        // int number argument - will print unicode value
        bufferedWriter.write(data1); // C
        bufferedWriter.write(data2); // A
        bufferedWriter.write(data3); // T

        // double - the program will crash
//        bufferedWriter.write(number);
        bufferedWriter.newLine();

        // convert to string by adding a new line
        bufferedWriter.write(number + "\n"); // double to string
        bufferedWriter.write(data1 + "\n"); // int to string

        // convert to string by adding empty string - use this if you don't want new line
        bufferedWriter.write(data2 + "");

        // another way to convert int to string - without new line
        bufferedWriter.write(Integer.toString(data3));


        bufferedWriter.close();

    }
}
