package myassignments;
import java.util.Scanner;
public class IsPrimeNumber {

	public static void main(String[] args) {
		int number,flag=0;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		number= sc.nextInt();
		if(number ==0 || number ==1) {
			System.out.println(number +": is not a prime number");
		}
		else {
			int middleNumber=number/2;
			for(int i=2; i<=middleNumber;i++) {
				if(number%i==0) {
					System.out.println(number+": is not a prime number");
					flag=1;
					break;
				}
				
			}
			
		}
		if (flag==0) {
			System.out.println(number+": is a prime number");
		}
	}

}

