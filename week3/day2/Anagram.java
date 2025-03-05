package week3.day2;


import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		
		if(text1.length()!=text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		System.out.println(charArray);
		System.out.println(charArray2);
		if(Arrays.equals(charArray,charArray2)) {
			System.out.println("The given strings are Anagram");
		}
		else {
			System.out.println("The given strings are not an anagram");
		}

	}

}
