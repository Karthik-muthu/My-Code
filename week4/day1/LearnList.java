package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List <String> mentors=new ArrayList<String>();
		mentors.add("Karthik");
		mentors.add("kamal");
		mentors.add("vicky");
		mentors.add("vijay");
		
		for (int i=mentors.size()-1;i<mentors.size();i--){
			System.out.println(mentors.get(i));
			
		}
		

	}

}
