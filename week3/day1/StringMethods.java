package week3.day1;

public class StringMethods {

	public static void main(String[] args) {
		String name="Karthikeyan";
		
		//compare with partial values
		System.out.println( name.length());
		System.out.println(name.contains("Kar"));
		
		//to Convert into uppercase
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
		//to convert into lower case
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		//charAT
		System.out.println(name.charAt(1));
		
		for(int i=0;i<name.length();i++) {
			char charAt = name.charAt(i);
			System.out.println(charAt);
		}
		
		//toCharArray
		char[] charArray = name.toCharArray();
		System.out.println(charArray[4]);
		
		//substring-- to crop a string
		
		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 7));//include begin index and exclude end index
		
		//split-convert one string into multiple
		
		String month="Jan feb mar april";
		String[] split = month.split("");
		System.out.println(split[0]);
		for (int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		
		//replaceAll-
		
		String price="45000$";
		String replaceAll = price.replaceAll("[^0-9]", " ");
		System.out.println(replaceAll);
		//output-45000
		
		String price1="42.023$";
		System.out.println(price1.replaceAll("[$]", " "));
		//output-42.023
		
		String price2="432 Dollar";
		System.out.println(price2.replaceAll("[A-Z a-z]", " "));
		
		String price3="45000";
		System.out.println(price3+2000);
		//output-450002000
		
		// Integer.parseInt -Convert string into Integer
		int int1 = Integer.parseInt(price3);
		System.out.println(int1+2000);
		
	
	}
}
