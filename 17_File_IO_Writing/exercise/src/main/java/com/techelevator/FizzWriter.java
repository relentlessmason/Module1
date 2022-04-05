package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Where would you like the program to write this? Please name a destination file:");
		String collectDestination = scanner.nextLine();
		File destination = new File(collectDestination);


		try (PrintWriter writer = new PrintWriter(destination)){

			List<Integer> numbers = new ArrayList<>();
			for(int i = 0; i<numbers.size(); i++) {
				int valueFinder = numbers.get(i);

				if (valueFinder % 3 == 0 && valueFinder % 5 == 0) {
					writer.println("FizzBuzz");
				}if (valueFinder % 3 == 0) {
					writer.println("Fizz");
				} if (valueFinder % 5 == 0) {
					writer.println("Buzz");
				} else {
					writer.println(valueFinder);}
			}
				} catch(Exception e){
				System.err.println("File not found");
			}
	}
}
