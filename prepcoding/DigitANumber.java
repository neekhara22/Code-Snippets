package com.prepcoding;

import java.util.Scanner;

public class DigitANumber {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = snc.nextInt();
		int counter = 0;
		int temp = num;
		while (temp != 0) {
			temp = temp / 10;
			counter++;
		}

		for (int i = counter - 1; i >= 0; i--) {
			int div = (int) (Math.pow(10, i));
			int rem = num / div;
			System.out.println(rem);
			num = num % div;
		}
	}
}