package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the search word? :");
        String searchWord = userInput.nextLine();
        System.out.println("What is the replacement word? :");
        String replacement = userInput.nextLine();
        System.out.println("What is the source file? :");
        String sourceFile = userInput.nextLine();
        File sourceFilePath = new File(sourceFile);
        System.out.println("What is the destination file? :");
        String destinationFile = userInput.nextLine();
        File destinationFilePath = new File (destinationFile);

        try (Scanner dataInput = new Scanner(sourceFilePath);
             PrintWriter writer = new PrintWriter(destinationFilePath)){

            while (dataInput.hasNextLine()){
                String lineOfText = dataInput.nextLine();
                writer.println(lineOfText.replace(searchWord,replacement));
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        }
    }
}
