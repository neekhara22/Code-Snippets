package com.prepcoding;

import java.util.Scanner;

public class ReverseDigitANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = scn.nextInt();

		while (num != 0) {
			int rem = num % 10;
			System.out.println(rem);
			num = num / 10;
		}

	}

}
