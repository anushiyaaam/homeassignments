package com.assignment.home;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 49;
		boolean isPrimeNumber = true;
		System.out.println("enter a number : " + num);
		for (int i = 2; i <= num - 1; i++) { // i<= num/2
			if (num % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}

		if (isPrimeNumber == true) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not a prime");
		}

	}

}
