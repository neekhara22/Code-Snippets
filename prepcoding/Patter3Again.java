package com.prepcoding;

import java.util.Scanner;

public class Patter3Again {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number sachin");
		int num = scn.nextInt();

//		int sp = num / 2;
//		int st = 1;
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= sp; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= st; j++) {
//				System.out.print("*");
//			}
//			if (i <= num / 2) {
//				sp--;
//				st += 2;
//			} else {
//				sp++;
//				st -= 2;
//			}
//			System.out.println();
//		}

		int sp = 1;
		int st = (num / 2) + 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			for (int j = 1; j < sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			if (i <= num / 2) {
				st--;
				sp += 2;
			} else {
				st++;
				sp -= 2;
			}
			System.out.println();
		}

	}
}