package com.prepcoding;

import java.util.Scanner;

public class LCM_HCF {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st digit baby");
		int num1 = scn.nextInt();
		System.out.println("Enter 2nd digit baby");
		int num2 = scn.nextInt();
//		int hcf = 1;
//		int lcm = 1;
//		for (int i = 1; i <= num1; i++) {
//			if (num1 % i == 0 && num2 % i == 0) {
//				if (hcf < i) {
//					hcf = i;
//				}
//			}
//		}
//		System.out.println("HCF is: " + hcf);
//
//		for (int j = num1; j <= (num1 * num2); j++) {
//			if (j % num1 == 0 && j % num2 == 0) {
//				lcm = j;
//				break;
//			}
//		}
//		System.out.println("LCM is: " + lcm);

		// new method
		int on1 = num1;
		int on2 = num2;
		int lcm;
		while (num1 % num2 != 0) {
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
			
		}
		System.out.println("HCF is: " + num2);

		lcm = (on1 * on2) / num2;
		System.out.println("LCM is: " + lcm);
	}

}
