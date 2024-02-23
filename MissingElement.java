package week3.day3.list;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(a);
		for (int i=0;i<a.length-1;i++) {
			if(a[i]+1!=a[i+1]) {
				System.out.println("Missing Element is "   +(a[i] +1));
			}
			
			
		}
		
		

	}

}
