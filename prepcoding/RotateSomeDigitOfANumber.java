package DsaQue;

public class RotateSomeDigitOfANumber {

	public static void main(String[] args) {
		int num = 123456789;
		int rot = 25;
		
		
		
		//By String
		String str = Integer.toString(num);
		int exactRotate = rot % str.length();
		System.out.println(exactRotate);
		String st = "";
		for (int i = exactRotate; i < str.length(); i++) {
			st += str.charAt(i);
		}
		for (int i = 0; i < exactRotate; i++) {
			st += str.charAt(i);
		}
		int ans1 = Integer.parseInt(st);
		System.out.println(ans1);
	}
}
		
		

		//By Number
//		int temp = num;
//		int count = 0;
//		while (temp != 0) {
//			count++;
//			temp /= 10;
//		}
//		int exactRotate = rot % count;
//		System.out.println(exactRotate);
//
//		int mul = (int) (num / Math.pow(10, count - exactRotate));
//		int rem = (int) (num % Math.pow(10, count - exactRotate));
//		rem = (int) (rem * Math.pow(10, exactRotate));
//		int ans = rem + mul;
//		System.out.println(ans);
//	}
//}