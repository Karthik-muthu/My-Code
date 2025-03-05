package week3.day1;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		System.out.println(split[0]);
		
		int count=0;
		
		for(int i=0;i<split.length;i++) 
		{
			for(int j=i+1;j<split.length;j++)
			{
				if(split[i].equalsIgnoreCase(split[j])) 
				{
					split[j]=" ";
					count=count+1;
					
				
				}
			
			}
				
				
			}
		if(count>0) {
			String output=String.join(" ", split);
			System.out.println(output);
		}

	}

}
