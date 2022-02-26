package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
//Please enter the length: 58
//Is the measurement in (m)eter, or (f)eet? f
//58f is 17m.
// The foot to meter conversion formula is:
// m = f * 0.3048
// The meter to foot conversion formula is:
// f = m * 3.2808399
		//need: scanner, sout, above equations
		Scanner newLength = new Scanner(System.in);
		System.out.println("Please enter the length (numerical) you need to convert: ");
		double lengthInput = Double.parseDouble(newLength.nextLine());

		System.out.println("Is this measurement in Meters or Feet? (Please enter M or F): ");
		Scanner newInput = new Scanner(System.in);
		String metricOrImperial = newInput.nextLine();

		if (metricOrImperial.equals("M") || metricOrImperial.equals("m")){
			System.out.println("Your conversion is " + (lengthInput *3.2808399) + " feet"); }

		if (metricOrImperial.equals("F") || metricOrImperial.equals("f")){
			System.out.println("Your conversion is " + (lengthInput *0.3048) + " meters"); }
	}

}