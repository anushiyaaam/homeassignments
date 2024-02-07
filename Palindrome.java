package com.assignment.home;

public class Palindrome {

	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
		int input=121;
		int output=0;
		int temp=input;
		//temp=input;
		
		while (input!=0) {
			int remainder=input%10;
			 input=input/10;
			output=(output*10)+remainder;
			//temp=input;
		//System.out.println(output);
		
	}
		System.out.println(output);
		
		if (output==temp) {
			System.out.println("it is a palindrome");
			
			
		} else {
			System.out.println("It is not a palindrome");

		}
		
		
	
	

		

	}

}
