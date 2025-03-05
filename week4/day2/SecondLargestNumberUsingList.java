package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberUsingList {

	public static void main(String[] args) {
		int[] number={3, 2, 11, 4, 6, 7};
		List<Integer> numberList=new ArrayList<Integer>();
		
		numberList.add(3);
		numberList.add(2);
		numberList.add(11);
		numberList.add(4);
		numberList.add(6);
		numberList.add(7);
		
		System.out.println("List before sorting: "+numberList);
		
		Collections.sort(numberList);
		System.out.println("List after sorting: "+numberList);
		
		System.out.println("Size of the List: "+numberList.size());
		int size = numberList.size();
		
		System.out.println(numberList.get(size-2));

	}

}
