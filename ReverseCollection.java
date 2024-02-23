package week3.day3.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] companies = { "HCL,Wipro,AspireSystems,CTS" };

		// Add the collection to a List
		List<String> companyList = new ArrayList<String>(Arrays.asList(companies));

		// Reverse the list
		Collections.reverse(companyList);

		// iterate
		for (int i = companies.length - 1; i < 0; i--) {
			System.out.println(companies[i]);
		}
	}

}
