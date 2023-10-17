package topic6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; // ignore error

public class HelloWriting {
    public static void main(String[] args) throws IOException /* ignore error */ {

        FileWriter writer = new FileWriter("hello.txt"); // need a file name for argument
        // FileWriter can open, create, close, and write to a file
        // the file will be generated in the root directory of the project, if it doesn't exist
        // if the file already exists, it will be overwritten

        BufferedWriter bufferedWriter = new BufferedWriter(writer); // need FileWrite for argument
        // File I/O (Input/Output) is much slower than reading/writing to memory
        // BufferedWriter handles I/O in the background of the program
        // so memory-based operations can continue while the file is being used
        // in this way BufferedWriter makes code more efficient and faster than only using FileWriter

        bufferedWriter.write("Hello!\n");
        bufferedWriter.write("Hello Java Students!");
        bufferedWriter.newLine(); // you can use this instead of \n for new line
        bufferedWriter.write("Goodbye!");
        bufferedWriter.newLine();

        bufferedWriter.close(); // don't forget to close the file! it wouldn't write the file if you don't close


        FileWriter writer2 = new FileWriter("hello.txt", true);
        // append flag - true means add data to the end
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);
        bufferedWriter2.write("Other data!");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Hello Programmers!");
        bufferedWriter2.newLine();
        bufferedWriter2.write("End of file!");
        bufferedWriter2.newLine();
        bufferedWriter2.close();

    }
}
