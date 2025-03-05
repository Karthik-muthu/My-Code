package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test= "changeme";
        char[] charArray = test.toCharArray();
        for (int i=0; i<charArray.length;i++) {
        	int num=i%2;
        	if (num!=0) {
        		charArray[i] = Character.toUpperCase(charArray[i]);
        		
        		}
        	
        	System.out.print(charArray[i]);
        }

	}

}
