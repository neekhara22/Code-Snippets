package com.prepcoding;

import java.util.Scanner;

public class RotateANumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter digit for execution");
		int num = scn.nextInt();
		System.out.println("Enter no. of digit to rotate");
		int dig = scn.nextInt();
		int counter = 0;
		int temp = num;
		int abc = 0;
		while (temp != 0) {
			temp = temp / 10;
			counter++;
		}
//		dig=dig%counter;
//		
//		if (dig >= 0) {
//			int rem = num % (int) (Math.pow(10, dig));
//			num = (int) (num / (Math.pow(10, dig)));
//			abc = rem * (int) (Math.pow(10, counter - dig)) + num;
//		}
//		else {
////			dig=Math.abs(dig);
//			dig=dig+counter;
//			int rem = num / (int) (Math.pow(10, counter-dig));
//			num = (int) (num % (Math.pow(10, counter-dig)))*(int) (Math.pow(10, dig));
//			abc = rem + num;
//		}
		dig = dig % counter;
		if (dig < 0) {
			dig = dig + counter;
		}
		int rem = num % (int) (Math.pow(10, dig));
		num = (int) (num / (Math.pow(10, dig)));
		abc = rem * (int) (Math.pow(10, counter - dig)) + num;
		System.out.println(abc);

	}

}
