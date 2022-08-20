package DataStructure;

import java.util.Arrays;

public class BubbleDort {

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1 };
		bubble(array);
		System.out.println(Arrays.toString(array));

	}

	static void bubble(int[] array) {
		boolean swapped;
		// run the step n-1 times
		for (int i = 0; i < array.length; i++) {
			swapped = false;
			// for each step max item will come at the last respective index
			for (int j = 1; j < array.length - i; j++) {
				// swap if the item is smaller than the previous item
				if (array[j] < array[j - 1]) {
					// Swap
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					swapped = true;
				}
			}
			// if you did not swapped for a particular value of i that means the array is
			// sorted and hence stop the program
			if (!swapped) {
				break;
			}
		}
	}
}
