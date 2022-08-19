package com.prepcoding;

import java.util.Scanner;

public class PrimeNoRange {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.println("put lower range");
		long low = snc.nextLong();
		System.out.println("put higher range");
		long hign = snc.nextLong();

		for (long i = low; i <= hign; i++) {
			int counter = 0;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					++counter;
					break;
				}
			}
			if (counter == 0) {
				System.out.println(i + " prime");
			} else {
				System.out.println(i + " not prime");
			}
		}
	}

}
