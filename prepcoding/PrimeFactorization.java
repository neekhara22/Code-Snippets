package com.prepcoding;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your digit baby");
		int num = scn.nextInt();

		for (int i = 2; i * i <= num; i++) {  // By divisibility  rule ..the number will automatically divided only by prime number
			while (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
			}
		}
		if (num != 1) {
			System.out.println(num);
		}

//		
//		for (int i = 2; i <= num; i++) {       //First convert to prime no. then find factorization of a number 
//			for (int j = 2; j <= i; j++) {
//				if (i % j == 0) {
//					while (num % i == 0) {
//						System.out.print(i + " ");
//						num = num / i;
//					}
//				}
//			}
//		}
	}
}
