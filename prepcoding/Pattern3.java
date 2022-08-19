package com.prepcoding;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number baby");
		int num = scn.nextInt();

//		for (int i = 1; i <= num; i++) {
//			if (i % 2 != 0) {
//				for (int j = 1; j <= (num - i) / 2; j++) {
//					System.out.print(" ");
//				}
//				for (int k = 1; k <= i; k++) {
//					System.out.print("*");
//				}
////				for (int j = 1; j <= (num - i) / 2; j++) {
////					System.out.print(" ");
////				}
//				System.out.println();
//			}
//		}
//		for (int i = num - 2; i >= 1; i--) {
//			if (i % 2 != 0) {
//				for (int j = (num - i) / 2; j >= 1; j--) {
//					System.out.print(" ");
//				}
//
//				for (int k = i; k >= 1; k--) {
//					System.out.print("*");
//				}
////				for (int j = (num - i) / 2; j >= 1; j--) {
////					System.out.print(" ");
////				}
//				System.out.println();
//			}
//		}
		num += 2;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= (num - i) / 2; j++) {
					System.out.print("*");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (num - i) / 2; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		for (int i = num - 4; i >= 1; i--) {
			if (i % 2 != 0) {
				for (int j = (num - i) / 2; j >= 1; j--) {
					System.out.print("*");
				}

				for (int k = i; k >= 1; k--) {
					System.out.print(" ");
				}
				for (int j = (num - i) / 2; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}