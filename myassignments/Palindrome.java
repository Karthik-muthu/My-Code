package myassignments;


import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {

		int number,orgNumber;
		
		System.out.println("Enter the number; ");
		Scanner sc= new Scanner(System.in);
		number= sc.nextInt();
		orgNumber=number;
		int reverseNumber=0;
		while(number>0) {
			reverseNumber =reverseNumber*10+number%10;
			number=number/10;
		}
		if(orgNumber==reverseNumber) {
			System.out.println(orgNumber+" is a palindrome");
		}
		else {
			System.out.println(orgNumber+" is not a palindrome");
		}
	}
		
		

	}


