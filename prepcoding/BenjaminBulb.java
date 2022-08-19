package com.prepcoding;

import java.util.Random;
import java.util.Scanner;

public class BenjaminBulb {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of bulbs baby");
		int num = scn.nextInt();
//		boolean val;
//		for (int i = 1; i <= num; i++) {
//			val = false;
//			for (int j = 1; j <= num; j++) {
//				if (i % j == 0) {
//					if (val == true) {
//						val = false;
//					} else {
//						val = true;
//					}
//				}
//			}
//			if (val == true) {
//				System.out.print(i + " ");
//			}
//		}

		for (int i = 1; i * i <= num; i++) {
			System.out.print(i * i + " ");
		}
	}
}
