package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		// temperatureCelcius = (temperatureFarenheit - 32) / 1.8
		// temperatureFarenheit = temperatureCelcius * 1.8 + 32
		//Please enter the temperature: 58
		//Is the temperature in (C)elsius, or (F)ahrenheit? F
		//58F is 14C.
		// Need: Scanner, sout, equations
		Scanner newTemp = new Scanner(System.in);

		System.out.println("Please enter the temperature: ");

		double tempDigits = Double.parseDouble(newTemp.nextLine());
		double temp = Double.parseDouble(String.valueOf(tempDigits));

		System.out.println("Is the temperature in (C)elcius or (F)ahrenheit: ");
		Scanner input = new Scanner((System.in));

		String celciusOrFarenheit = input.nextLine();

		if(celciusOrFarenheit.equals("C") || celciusOrFarenheit.equals("c")){
			double farenheitTemp = temp * 1.8 + 32;
			System.out.println(temp + " F is " + farenheitTemp + " F");
		}
		else if (celciusOrFarenheit.equalsIgnoreCase("F")) {
			double celciusTemp = ((temp - 32) / 1.8);
			System.out.println(temp + " F is " + celciusTemp + " C");
		}

	}

}
