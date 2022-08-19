package com.prepcoding;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number baby");
		int num = scn.nextInt();

//		int sp1 = 0;
//		int st = 1;
//		int sp2 = num - 2;
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= sp1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= st; j++) {
//				System.out.print("*");
//			}
//			for (int j = 1; j <= sp2; j++) {
//				System.out.print(" ");
//			}
//			if (i != (num / 2 + 1)) {
//				for (int j = 1; j <= st; j++) {
//
//					System.out.print("*");
//				}
//			}
//			if (i <= num / 2) {
//				sp1++;
//				sp2 -= 2;
//			} else {
//				sp1--;
//				sp2 += 2;
//			}
//			System.out.println();
//		}

		int st = 1;
		int sp1 = num / 2;
		int sp2 = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= sp1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= sp2 - 1; j++) {
				System.out.print(" ");
			}
			if (i != 1 && i != num) {
				for (int j = 1; j <= st; j++) {

					System.out.print("*");
				}
			}
			if (i <= num / 2) {
				sp1--;
				sp2 += 2;
			} else {
				sp1++;
				sp2 -= 2;
			}
			System.out.println();
		}
	}

}
