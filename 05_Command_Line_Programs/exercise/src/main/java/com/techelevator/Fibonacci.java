package com.techelevator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
// code has to recognise when a number is in the fibonnaci sequence
	// code has to be able to build the fibonacci sequence up to any input
	// sequence is number plus number before it
	// don't forget to account for zero

	public static void main(String[] args) {
		//Da Fibonnaci code: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987

		System.out.println("Enter a value and we'll show you the fibb (Note: it must be a positive, whole integer): ");
		Scanner newInput = new Scanner(System.in);
		int numericalInput = Integer.parseInt(newInput.nextLine());

		int a = 0; // le zero
		int b = 1; // le one
		int c = 0; // le variable

		//if (numericalInput<0){
		//	System.out.println("That won't work...");}
		//if (numericalInput==0){
		//	System.out.println("You found the beginning! \"0\" is the answer!");}
		if (numericalInput <= 0){
			System.out.println(a + " " + b);}

		if (numericalInput == 1) {
			System.out.println(a +" " + b + " " + b);
		}
		if (numericalInput > 1000){
			System.out.println("I'm sorry, I didn't build it to go that high...");}

		if (numericalInput > 1 && numericalInput <= 1000){
				System.out.println(a);
				System.out.println(b);
				for (int i=2; i<17; i++){
					c = a + b;
					if (c <= numericalInput){
						System.out.println(c);}
					a = b;
					b = c;

				}
			}
		}
	}

