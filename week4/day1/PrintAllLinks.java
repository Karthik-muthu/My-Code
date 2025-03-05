package week4.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		List<String> linkValue=new ArrayList<String>();
		
		for(int i=0;i<allLinks.size();i++) {
			String text = allLinks.get(i).getText();
			linkValue.add(text);
			
		}
		System.out.println("The List of links are: "+linkValue);
	}

}
