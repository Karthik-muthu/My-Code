package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTables {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		//load URL
		
		driver.get("https://leafground.com/table.xhtml");
		
		//maximize webpage
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		
		//to find no of rows
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		int rowSize = allRows.size();
		System.out.println("Number of rows: "+rowSize);
		
		//to find no of columns
		
		List<WebElement> allColumns = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
        int columnSize = allColumns.size();
        System.out.println("Number of Columns: "+columnSize);
        
        //to print the table data
        
        String data1 = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td[1]")).getText();
        
        System.out.println(data1);
        
        for(int i=1;i<=rowSize;i++) {
        	for(int j=1;j<=columnSize;j++) {
        		String allData = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]")).getText();
        		System.out.println("The table data are: "+allData);
        	}
        }
        List<WebElement> row1Data = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
        for(int i=1;i<row1Data.size();i++) {
        	String row1 = row1Data.get(i).getText();
        	System.out.println("Row 1 data: "+row1);
        	
        }
   
	}

}
