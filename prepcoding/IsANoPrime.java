package com.prepcoding;

import java.util.Scanner;

public class IsANoPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of time to check prime");
		int t = scn.nextInt();

		for (int i = 0; i < t; i++) {
			System.out.println("Enter number");
			int n = scn.nextInt();

			int count = 0;
			for (int j = 2; j * j <= n; j++) {
				if (n % j == 0) {
					++count;
					break;
				}
			}
			if (count == 0) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}
		}

	}

}
