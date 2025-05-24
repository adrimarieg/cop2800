/*
Write a program that opens an output file named numbers.txt. The program should write the integer values 1 through 49 to the file, with each number written on its own line in the file. Be sure to close the file when you are finished with it.

The name of your program class should be WriteFile.

Note: This program should not display any output on the screen.
*/

import java.util.Scanner;
import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        PrintWriter outputFile = new PrintWriter("numbers.txt");

        for (int i = 1; i < 50; i++) {
            outputFile.println(i);
        }
    outputFile.close();

    }
}
