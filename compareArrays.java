package week3.day3.list;

import java.util.ArrayList;
import java.util.List;

public class compareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]=  {3, 2, 11, 4, 6, 7};
 int b[]= {1, 2, 8, 4, 9, 7};
 //adding the array to list
 
 List<Integer>intarray=new ArrayList<Integer>();
 List<Integer> intarrayone=new ArrayList<Integer>();
 
 //comparing the arrayvalue using list
 for(int i=0; i<a.length;i++) {

	 for(int j=0; j<b.length;j++) {
		 
		 intarray.add(a[i]);
		 intarrayone.add(b[j]);
		 if(a[i]==b[j]) {
			 
			 System.out.println(a[i]);//output is 2,4,7
		 }
		 
		 
		 
	 }
      
	}

}
	}
