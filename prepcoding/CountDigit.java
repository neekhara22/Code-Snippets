package com.prepcoding;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.println("Enter digit");
		int a = snc.nextInt();
		int counter = 0;
		while (a != 0) {
			a = a / 10;
			counter++;
		}
		System.out.println(counter);
	}

}
