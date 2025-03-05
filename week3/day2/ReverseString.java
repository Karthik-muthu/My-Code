package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String mail= new String("karthikmuthuramalingam99");
		
		char[] charArray = mail.toCharArray();	
		
		for(int i=charArray.length-1; i<charArray.length;i--){
			System.out.println(charArray[i]);
		}
		
		}
		}


