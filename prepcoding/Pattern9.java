package com.prepcoding;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number baby");
		int num = scn.nextInt();

		int fac=1;
		int j=1;
		while(j<=num) {
			fac*=j;
			j++;
		}
		System.out.println(fac);
		
		

	}

}
