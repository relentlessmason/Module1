package com.techelevator;

import java.util.Scanner;

public class Fibonacci {
// code has to recognise when a number is in the fibonnaci sequence
	// code has to be able to build the fibonacci sequence up to any input
	// sequence is number plus number before it
	// don't forget to account for zero

	public static void main(String[] args) {
		int[] fibbyArray = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,
		377, 610, 987};
		System.out.println("Enter a value and we'll show you the goods (Note, it must be a positive, whole integer): ");
		Scanner newInput = new Scanner(System.in);
		int numericalInput = Integer.parseInt(newInput.nextLine());

		if (numericalInput<0){
			System.out.println("That won't work...");
		}
		if (numericalInput==0){
			System.out.println("You found the beginning! \"0\" is the answer!");
		}
		if (numericalInput == 1) {
			System.out.println("0, 1, 1");
		}
		if (numericalInput>1){
			
		}
	}

}
