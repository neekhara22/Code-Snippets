package com.prepcoding;

import java.util.Scanner;

public class FibonacciNo {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.println("Enter digits to find a fibonacci no...");
		int num = snc.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 0; i <= num; i++) {
			System.out.print(" " + a);
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
