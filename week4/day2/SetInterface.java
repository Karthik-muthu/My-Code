package week4.day2;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		String companyName="google";
		Set<Character> name=new LinkedHashSet<Character>();
		char[] charArray = companyName.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			char c = charArray[i];
			name.add(c);
			
		}
		System.out.println(name);

	}

}
