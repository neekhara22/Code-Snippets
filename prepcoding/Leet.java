package com.prepcoding;

public class Leet {
	public double myPow(double x, int n) {
		double counter = x;

		if (n == 0) {
			counter = 1;
		} else if (n > 0) {
			for (int i = 0; i < n - 1; i++) {
				counter *= x;
			}
		} else if (n < 0) {
			for (int i = n - 1; i < 0; i++) {
				counter /= x;
			}
		}
		return counter;
	}
//		if (n == 0) {
//			x = 1;
//		} else if (n > 0) {
//			while (n != 1) {
//				x *= counter;
//				n--;
//			}
//		} else if (n < 0) {
//			while (n != 1) {
//				x /= counter;
//				n++;
//			}
//		}
//		return x;
//	}

	public static void main(String[] args) {
		Leet leet = new Leet();

		System.out.println(leet.myPow(2.00000, -3));
	}

}
