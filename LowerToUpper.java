package com.homeassignments;

public class LowerToUpper {

	// Main driver method
	public static void main(String args[]) {

		String text = "aNaNd";

		String result = "";

		char[] charArray = text.toCharArray();// {a, N, a, N, d}
		for (int i = charArray.length - 1; i >= 0; i--) {

			if (i % 2 == 0) {
				result = result + Character.toUpperCase(charArray[i]);
			} else {
				result = result + Character.toLowerCase(charArray[i]);
			}

		}
		System.out.println(result);

	}
}
