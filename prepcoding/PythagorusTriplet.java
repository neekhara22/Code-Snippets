package com.prepcoding;

import java.util.Scanner;

public class PythagorusTriplet {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st digit baby");
		int num1 = scn.nextInt();
		System.out.println("Enter 2nd digit baby");
		int num2 = scn.nextInt();
		System.out.println("Enter 3rd digit baby");
		int num3 = scn.nextInt();

		int hyp;
		int per;
		int base;
		if (num1 > num2 && num1 > num3) {
			hyp = num1;
			per = num2;
			base = num3;

		} else if (num2 > num1 && num2 > num3) {
			hyp = num2;
			per = num1;
			base = num3;
		} else {
			hyp = num3;
			per = num1;
			base = num2;
		}
		int hypotaneousSquare = hyp * hyp;
		int perpendicularSquare = per * per;
		int baseSquare = base * base;
		if (hypotaneousSquare == (perpendicularSquare + baseSquare)) {
			System.out.println("this value of sides will form a Right Angle Triangle");
		} else {
			System.out.println("this value of sides will not form a Right Angle Triangle");
		}
	}

}
