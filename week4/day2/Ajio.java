package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		//Launch the url
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//search
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		//click the men
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		//get text
		
		String text = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		
		System.out.println("Total items: "+text);
		
		//select brands
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		
		//Click the more
		
		driver.findElement(By.xpath("//div[@id='verticalsizegroupformat-brand']/strong")).click();
		
		List<WebElement> listBrands = driver.findElements(By.xpath("//div[@class='facet-filter-modal__body']/ul"));
		
		System.out.println("The number of brands are: "+listBrands.size());
		
		List<String> noOfBrands=new ArrayList<String>();
		for(int i=0;i<listBrands.size();i++) {
			String text2 = listBrands.get(i).getText();
			noOfBrands.add(text2);
		}
		System.out.print("The number of Brands: "+noOfBrands);
		
		driver.findElement(By.xpath("//span[text()='HIDESIGN']")).click();
		
		driver.findElement(By.xpath("//span[text()='Da Milano']")).click();
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		//list of bags
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int  noOfBags= elements.size();
		
		System.out.println("The number of bags are: "+noOfBags);
		
		List<String> bagList=new ArrayList<String>();
		for (int i=0;i<noOfBags;i++) {
			String bagNames = elements.get(i).getText();
			bagList.add(bagNames);
		}
		
		System.out.println("The list of bag in the page are: "+bagList);
		

	}

}
