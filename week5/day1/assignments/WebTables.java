package week5.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
		
		//load URL
		
		driver.get("https://erail.in/");
		
		//maximize webpage
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//clear the textbox
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		
//		Enter "MAS" as the "From" station.
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys(Keys.ENTER);
		

//		- Enter "MDU" as the "To" station.
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys(Keys.ENTER);
		
//		- Uncheck the "Sort on Date" checkbox.
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
//		- Retrieve the train names from the web tab
		
		WebElement table = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table)[1]/tbody"));
		
		List<WebElement> tableRow = table.findElements(By.tagName("tr"));
		
		int rowSize = tableRow.size();
		System.out.println("Total no of rows: "+rowSize);
		
		//table data size
		
		List<WebElement> tablecolunm = table.findElements(By.xpath("(//div[@id='divTrainsList']/table)[1]/tbody/tr/td"));
		int colSize = tablecolunm.size();
	    System.out.println("No of colunms: "+colSize);
	    
		//table header
		List<WebElement> tableHead = table.findElements(By.xpath("(//div[@id='divTrainsList']/table)[1]/tbody/tr/th"));
		int headSize = tableHead.size();
		
		System.out.println("no of hearders: "+headSize);
		
		//print all table head
		
		for (int i = 1; i <=headSize; i++) {
			
			 String allHead = table.findElement(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/th["+i+"]")).getText();
			System.out.println("The table heads are: "+allHead);
		}
//		
//		for (int i = 2; i <=rowSize ; i++) {
//			for (int j = 1; j <=colSize; j++) {
//				String allText = table.findElement(By.xpath("//div[@id='divTrainsList']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
//				System.out.println("All data of the table: "+allText);
//			}
//		}

		for (int i = 2; i <=rowSize; i++) {
		String trainName = table.findElement(By.xpath("//div[@id='divTrainsList']/table/tbody/tr["+i+"]/td["+2+"]")).getText();
		System.out.println("The train Names are: "+trainName);
		if(trainName.contains("GURUVAYUR")) {
			System.out.println("MS GURUVAYUR EXP is available");
			String replace = trainName.replaceAll("[MS]", "");
			System.out.println(replace);
		}
		}
		
		
	}

}
