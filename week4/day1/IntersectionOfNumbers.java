package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectionOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] arr1={3, 2, 11, 4, 6, 7};

		List<String> list1=new ArrayList<String>();
		
		list1.add(0, "3");
		list1.add(1, "2");
		list1.add(2, "11");
		list1.add(3, "4");
		list1.add(4, "6");
		list1.add(5, "7");
		
		System.out.println("the length of the list1: "+list1.size());
		System.out.println("The elements in the list1 are: "+list1);
		
//		int[] arr2={1, 2, 8, 4, 9, 7};
		
List<String> list2=new ArrayList<String>();
		
		list2.add(0, "1");
		list2.add(1, "2");
		list2.add(2, "8");
		list2.add(3, "4");
		list2.add(4, "9");
		list2.add(5, "7");
		
		System.out.println("the length of the list2: "+list2.size());
		System.out.println("The elements in the list2 are: "+list2);
		
		//sorting both the list
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("List1 after sorting: "+list1);
		System.out.println("List2 after sorting: "+list2);
	
	for(int i=0;i<list1.size();i++) {
		
		for(int j=0;j<list2.size();j++) {
			if(list1.get(i)==(list2.get(j))) {
				System.out.println(list1.get(i)+" :is the intersection number");
			}
					}
	}
	
	

}}
