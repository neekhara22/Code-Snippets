package com.prepcoding;

import java.util.Scanner; //import to user input

public class PrintZ {

	public static void main(String[] args) {
		// input
		Scanner scr = new Scanner(System.in); // made new scanner object
		String str = scr.nextLine();
		int marks = Integer.parseInt(scr.nextLine()); // parse the value
		System.out.println("The number are " + marks);

		System.out.println("The name is " + str);

	}

}
