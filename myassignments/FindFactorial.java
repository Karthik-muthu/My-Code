package myassignments;
import java.util.Scanner;
public class FindFactorial {
	public static void main(String[] args) {
		int fact=1;
		int number;
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " +number+" is: "+fact );
	}

}
