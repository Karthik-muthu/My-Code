package myassignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n=8;
		int firstNum=0,secondNum=1;
		int nextNum;
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(firstNum + ",");
			nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
			
		}

	}

}
