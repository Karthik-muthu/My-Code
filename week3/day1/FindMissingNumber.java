package week3.day1;



public class FindMissingNumber {
	
	public void FindMissingElement() {
		int []a= {1, 4,3,2,8, 6, 7}	;
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
			
		}
		int sum2=0;
		for(int j=1;j<=8;j++) {
			sum2=sum2+j;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println("The Missing number is: "+(sum2-sum1));		
		
		}
//	
	

	public static void main(String[] args) {
	
		FindMissingNumber number=new FindMissingNumber();
		number.FindMissingElement();

	}

}
