package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		int lineNumber = 1;
		boolean isCaseSensitive = true;
		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the name of the file that should be searched?");
		String pathName = userInput.nextLine();
		File filePathing = new File(pathName);

		System.out.println("What is the word you are looking for?");
		String wordSearched = userInput.nextLine();
		System.out.println("Should the search be cAsE sEnsItIve? (y/n) : ");
		String caseSensitivityChoice = userInput.nextLine();

		if (caseSensitivityChoice.equalsIgnoreCase("y")){
			isCaseSensitive = true;
		}

		try (Scanner dataInput = new Scanner(filePathing)) {

			while (dataInput.hasNextLine()) {
				String line = dataInput.nextLine();
				String[] s = line.split(" ");

				for (String words : s) {
					if (!isCaseSensitive && words.equalsIgnoreCase(wordSearched)) {
						System.out.println(lineNumber + " " + line);}

					if (isCaseSensitive && words.contains(wordSearched))
						System.out.println(lineNumber + " " + line);}

				lineNumber++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("The file was not found: " + filePathing.getAbsolutePath());
		}
	}
}