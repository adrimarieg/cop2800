/*
Write a program that asks the user to enter the name of a file, and then asks the user to enter a character to count. The program should count and display the number of times that the specified character appears in the file. Here is a sample run of the program:

Enter file name: mydata.txt
Enter character to count: a
The character 'a' appears in the file mydata.txt 17 times.

In the sample run shown above, look carefully at the wording, the placement of spaces and punctuation. Your program's output must match the way it is formatted (with the correct values of course).

Your program class should be named FileLetterCounter.
*/


import java.util.Scanner;
import java.io.*;

public class FileLetterCounter {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String fileName;
        char targetChar;
        int count = 0;

        System.out.print("Enter file name: ");
        fileName = keyboard.next();

        System.out.print("Enter character to count: ");
        targetChar = keyboard.next().charAt(0);

        // Opening file
        Scanner inputFile = new Scanner(new File(fileName));

        //Reading file
        while (inputFile.hasNextLine()) {
            String line = inputFile.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == targetChar) {
                    count++;
                }
            }
        }
        System.out.println("The character '" + targetChar + "' appears in the file " + fileName + " " + count + " times.");
    }
}
