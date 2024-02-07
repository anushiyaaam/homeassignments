package com.assignment.home;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int num3;
		int num1 = 0, num2 = 1;
		System.out.println("Fibonacciseries " + num1);
		System.out.println(num2);

		for (int i = 2; i < range; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;

		}

	}

}
