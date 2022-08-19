package com.prepcoding;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number baby");
		int num = scn.nextInt();

		int a = 0;
		int b = 1;
		int sum;
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				sum = a + b;
				a = b;
				b = sum;
				
			}
			System.out.println();
		}

	}

}
