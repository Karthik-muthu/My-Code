package week3.day1;

import java.util.Arrays;

public class MissingNumber {
	
	public void FindNumber() {
		int a[]= {0,1,4,3,2,8,6,7}; 
		Arrays.sort(a);
	    for(int i=0;i<a.length;i++) {
	    	if (i!=a[i]) {
	    		System.out.println(i);
	    		break;
	    	}
	    }
	}

	public static void main(String[] args) {
		MissingNumber number1= new MissingNumber();
		number1.FindNumber();
		

	}

}
