package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		int lineNumber = 1;
		boolean isCaseSensitive = true;
		Scanner userInput = new Scanner(System.in);
//ask user for file to search
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String pathName = userInput.nextLine();
		File aliceWonderland = new File(pathName);
//ask user for the word to search in file
		System.out.println("What is the search word you are looking for?");
		String wordSearched = userInput.nextLine();
		System.out.println("Should the search be case sensitive?");
		String sensitivityChoice = userInput.nextLine();
		try (Scanner dataInput = new Scanner(aliceWonderland)) {
			while (dataInput.hasNextLine()) {
				String lineOfText = dataInput.nextLine();
				String[] s = lineOfText.split(" ");
				for (String words : s) {
					if (sensitivityChoice.equalsIgnoreCase("n")) {
						if (words.equalsIgnoreCase(wordSearched)) {
							System.out.println(lineNumber + " " + lineOfText);
						}
					}
					if (sensitivityChoice.equalsIgnoreCase("y")) {
						if (words.contains(wordSearched))
							System.out.println(lineNumber + " " + lineOfText);
					}
				}
				lineNumber++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found: " + aliceWonderland.getAbsolutePath());
		}
	}
}