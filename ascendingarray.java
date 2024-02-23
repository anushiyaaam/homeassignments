package week3.day3.list;

import java.util.Arrays;

public class ascendingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring an array
		int a[] = { 3, 2, 11, 4, 6, 7 };

		// sorting an array
		Arrays.sort(a);
		String b = Arrays.toString(a);
		System.out.println(Arrays.toString(a));

		// Getting the largest number in array

		/*
		 * int largest = a.length - 1; System.out.println(largest);
		 */
		System.out.println("Largest number in array is " + a[a.length - 1]);

		// Getting second number in array
		
		System.out.println("Second largest number in array is  "  +a[a.length-2]);

	}
}
