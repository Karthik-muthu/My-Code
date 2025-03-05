package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] company= {"HCL", "Wipro" ,"Aspire", "Systems", "CTS"};

//		Arrays.sort(company);
//		System.out.println(Arrays.toString(company));
//		
//		//System.out.println(company[1]);
//		for(int i=company.length-1;i<company.length;i--) {
//			System.out.println(company[i]);
		
		List<String> companyName=new ArrayList<String>();
		Collections.addAll(companyName, company);
		System.out.println("Company names before sorting: "+companyName);
		
		Collections.sort(companyName);
		System.out.println("Company names after sorting: "+companyName);
		
		Collections.reverse(companyName);
		System.out.println("Company names after reversed using collections: "+companyName);
		
		}
	}


