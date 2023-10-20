package topic6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting2 {
    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"));) {
            bufferedWriter.write("Hello!\n");
            bufferedWriter.write("Hello Java Students!");
            bufferedWriter.newLine();
            bufferedWriter.write("Goodbye!");
            bufferedWriter.newLine();
        } catch (IOException ioe) {
            System.out.println("Error writing to file " + ioe);
        }

        try (BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter("hello.txt"));) {
            bufferedWriter2.write("Other data!");
            bufferedWriter2.newLine();
            bufferedWriter2.write("Hello Programmers!");
            bufferedWriter2.newLine();
            bufferedWriter2.write("End of file!");
            bufferedWriter2.newLine();
        } catch (IOException ioe) {
            System.out.println("Error appending data to file " + ioe);
        }

    }
}
