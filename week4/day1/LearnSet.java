package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		Set <String> Trainers=new LinkedHashSet<String>();
		
		Trainers.add("Karthik");
		Trainers.add("Siva");
		Trainers.add("Hari");
		Trainers.add("Nantha");
		Trainers.add("karthik");
		
		
		//remove on element
		Trainers.remove("karthik");
		
		System.out.println(Trainers);
		
		//add all to a new set
		Set <String> newTrainers=new HashSet<String>(Trainers);
		
		System.out.println(newTrainers);
		
		//to retrieve on particular element.
		
		List<String> trainersList= new ArrayList<String>(newTrainers);
		
		System.out.println(trainersList.get(3));

	}

}
