package com.prepcoding;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number baby");
		int num = scn.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
}