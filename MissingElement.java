package com.assignment.home;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 3, 2, 8, 6, 7 };
		int arraylength;
		// System.out.println("array elements " +arr[0]);
		arraylength = arr.length;
		int missingNumber = 0;
		Arrays.sort(arr); // {1, 2, 3, 4, 6, 7, 8}

		for (int i = 0; i < arraylength; i++) {
			if (arr[i] != i + 1) {
				missingNumber = i + 1;
				System.out.println("Missing number is " + missingNumber);
				break;

			}

		}

	}

}
