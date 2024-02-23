package com.homeassignments;

public class ReverseOddwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'

		String test = "I am a software tester";

		// I ma a erawtfos tester
		// 0 1 2 3 4
		// 0%2 1%2==1 2%2==0
		String[] splitWords = test.split(" "); // {"I", "am", "a", "software", "tester"};

		int length = splitWords.length; // 5

		// System.out.println(length);

		for (int i = 0; i < length; i++) {

			if (i % 2 == 1) {

				// System.out.println(splitWords[i]);

				String evenWords = splitWords[i];

				String reverse = "";

				for (int j = evenWords.length() - 1; j >= 0; j--) {

					char charAt = evenWords.charAt(j);

					// System.out.print(charAt);
					reverse = reverse + charAt;
					// System.out.print(reverse);

				}
				//ma
 
				splitWords[i] = reverse;

			}

		}

		// {"I", "ma", "a", "erawtfos", "tester"};
		String join = String.join(" ", splitWords);
		System.out.println(join);

	}

}
