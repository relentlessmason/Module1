package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {


    public static void main(String[] args) {
        Scanner giveMeTheNumber = new Scanner(System.in); // set to scan
        System.out.println("Enter the values you wish to convert, separated by a space: ");
        String convertMe = giveMeTheNumber.nextLine();
        String[] convertMeSeparated = convertMe.split(" ");

        String binary[] = new String[100]; //here is an array to use to play with numbers

        for (int i = 0; i < convertMeSeparated.length; i++) { // starts at zero, only goes for the length, moves forward
            int calculateBinary = Integer.parseInt(convertMeSeparated[i]); //changes from a string to an int

            System.out.print(convertMeSeparated[i] + " in binary is "); //prepping for the hard part

            int binaryArray[] = new int[50]; //array for our function to move on
            int a = 0; //starting point
            while (calculateBinary > 0) {
                binaryArray[a++] = calculateBinary % 2; //function one
                calculateBinary = calculateBinary / 2; // function two BACK TO BACK BABY

            }
            for (int j = a - 1; j >= 0; j--){ //for some reason this has to be after the while loop or it breaks
                System.out.print(binaryArray[j]);

            } System.out.println(" ");
        }
    }
}
// test run numbers 460 8218 1 31313 987654321