package com.prepcoding;

import java.util.Scanner;

public class SpecialInverseOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = scn.nextInt();
//		int get = Integer.toString(num).length();
//		int[] arr = new int[get + 1];
//		int rev[] = new int[get + 1];
//		for (int i = 1; i <= get; i++) {
//			arr[i] = num % 10;
//			int j = arr[i];
//			rev[j] = i;
//			num = num / 10;
//		}
//		for (int j = get; j >= 1; j--) {
//			System.out.print(rev[j] + " ");
//		}
		int neew = 0;
		int counter = 0;
		int a = num;
		while (a != 0) {
			a = a / 10;
			counter++;
		}
		for (int i = 1; i <= counter; i++) {
			int rem = num % 10;
			neew = neew + (int) (i * Math.pow(10, rem - 1));
			num = num / 10;
		}
		System.out.println(neew);
	}
}