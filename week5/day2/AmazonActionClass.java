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

public class AmazonActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {
        ChromeDriver driver=new ChromeDriver();
		
		//load URL
		
		driver.get("https://www.amazon.in/");
		
		//maximize webpage
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Search for "oneplus 9 pro".
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		
		// Get the price of the first product.
		
		String productName = driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']/span")).getText();
		System.out.println("Product name of the first one: "+productName);
		
		String productPrize = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-micro puis-price-instructions-style']")).getText();
		System.out.println("Prize of the 1st product: "+productPrize);
		
//			 Print the number of customer ratings for the first displayed product.
		
	Actions act= new Actions(driver);
//		
//		WebElement rating = driver.findElement(By.xpath("//div[@class='a-row a-size-small']"));
//		//Thread.sleep(2000);
//		act.moveToElement(rating).perform();
		
		//driver.findElement(By.xpath("(//span[text()='4.4 out of 5 stars'])[1]")).click();
//		
//		String ratings = driver.findElement(By.xpath("(//span[text()='4.4 out of 5 stars'])[1]")).getText();
//		System.out.println("Customer ratings for the product is: "+ratings);
		
//		   Click the first text link of the first image.
		
		driver.findElement(By.xpath("//span[contains(text(),'OnePlus 11 5G')]")).click();
		
		
		//switch to another window
		
		Set<String> windowHandles = driver.getWindowHandles();	
		
		List<String> windowAdd=new ArrayList <>(windowHandles);
		String childAddress = windowAdd.get(1);
		driver.switchTo().window(childAddress);
		
//			 Take a screenshot of the product displayed.
		Thread.sleep(10000);
		WebElement image = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		File mobileImg = image.getScreenshotAs(OutputType.FILE);
		File destination=new File("./img/oneplus.png");
		FileUtils.copyFile(mobileImg, destination);
//			 Click the 'Add to Cart' button.
		
		WebElement scrollDown = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		
		Thread.sleep(5000);
		act.scrollToElement(scrollDown).perform();
		
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		
//			 Get the cart subtotal and verify if it is correct.
		
		String subTotal = driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']")).getText();
		
		System.out.println(subTotal);
		String replaceAll = subTotal.replaceAll("[^0-9]", "");
		String replaceAll2 = replaceAll.replaceAll("[a-zA-Z]", "");
		System.out.println(replaceAll2);
		
		
		if (replaceAll.equals("16199900")) {
			System.out.println("The amounts are matched");
		}
		else {
			System.out.println("Amount not matched");
		}
//			 Close the browser.
		driver.quit();
		

	}

}
