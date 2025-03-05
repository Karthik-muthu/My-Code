package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		Click on "Shop by Category".
		
		driver.findElement(By.xpath("(//div[@class='relative h-full']/button)[2]")).click();
		
		
//		3. Mouse over "Foodgrains, Oil & Masala".
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement mouseHover = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		
		act.moveToElement(mouseHover).perform();
		
//		4. Mouse over "Rice & Rice Products".
		
		WebElement mouseHover2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		act.moveToElement(mouseHover2).perform();
		
//		5. Click on "Boiled & Steam Rice".
		
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		
//		6. Filter the results by selecting the brand "bb Royal".
		
		Thread.sleep(3000);
//		7. Click on "Tamil Ponni Boiled Rice".
		driver.findElement(By.xpath("(//div[@class='QuickSearch___StyledMenuButton-sc-rtz2vl-1 dpuSIx']//input)[2]")).sendKeys("Tamil Ponni Boiled Rice");
		
		driver.findElement(By.xpath("(//div[@class='QuickSearch___StyledMenuButton-sc-rtz2vl-1 dpuSIx']//input)[2]")).sendKeys(Keys.ENTER);

		//		8. Select the 5 Kg bag.
		
		Thread.sleep(3000);
		WebElement scroll = driver.findElement(By.xpath("(//button[text()='Add'])[2]"));
		act.scrollToElement(scroll).perform();
		scroll.click();
		
		
		driver.findElement(By.xpath("//h3[text()='Boiled Rice - Tamil Ponni']")).click();
		
//		String text = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
//		System.out.println(text);
		

		//Switch to another window
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List <String> allAddress=new ArrayList<>(windowHandles);
		
		String childAddress = allAddress.get(1);
		
		driver.switchTo().window(childAddress);
		
		
//		9. Check and note the price of the rice.(it is in the table)
		
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//div[@class='flex justify-between mb-4']/following-sibling::table"));
		
		List<WebElement> tableRow = table.findElements(By.xpath("//div[@class='flex justify-between mb-4']/following-sibling::table/tr"));
		int rowSize = tableRow.size();
		System.out.println("Table row size: "+rowSize);
		
		List<WebElement> tableColumn = table.findElements(By.tagName("td"));
		int columnSize = tableColumn.size();
		System.out.println("Table column size: "+columnSize);
		
		for(int i=1;i<=rowSize;i++) {
			for (int j = 1; j <= 2; j++) {
				WebElement tableData = table.findElement(By.xpath("//div[@class='flex justify-between mb-4']/following-sibling::table/tr["+i+"]/td["+j+"]"));
			String text = tableData.getText();
			System.out.println("Price details: "+text);
			}
			
		}
		
//		10. Click "Add" to add the bag to your cart.
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		
		
		
//		11. Verify the success message that confirms the item was added to your cart.
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
        System.out.println("Message appeared after add to cart: "+text);
        
        if(text.equalsIgnoreCase("An item has been added to your basket successfully")) {
        	System.out.println("The item added successfully.");
        }
        else {
        	System.out.println("The item is cancelled.");
        }
//		12. Take a snapshot of the current page
        Thread.sleep(3000);
        File source = driver.getScreenshotAs(OutputType.FILE);
        
        File destination=new File("./img/bigBasket.png");
        
        FileUtils.copyFile(source, destination);
//		13. Close the current window.
        
        driver.close();
        
//		14. Close the main window.
        
       driver.switchTo().window(allAddress.get(0));
       driver.close();

	}

}
