package com.prepcoding;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number baby");
		int num = scn.nextInt();

//		int sp = 0;
//		int st = 1;
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= sp; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= st; j++) {
//				System.out.print("*");
//			}
//			sp ++;
//			System.out.println();
//		}
		
		int sp =num-1;
		int st = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			sp --;
			System.out.println();
		}
	}

}
