package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
//		    1. Launch (https://www.snapdeal.com/)
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
        driver.findElement(By.xpath("//button[@id='pushDenied']")).click();
		
//			2. Go to "Men's Fashion".
        Thread.sleep(3000);
		WebElement mouseHover = driver.findElement(By.xpath("//span[@class='labelIcon']/following-sibling::span"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseHover).perform();
//			3. Go to "Sports Shoes".
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
//			4. Get the count of sports shoes.
		
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The count of the sports shoe: "+count);
		
//			5. Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
//			6. Sort the products by "Low to High".
		
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
//			7. Check if the displayed items are sorted correctly.
		
		String lowPrize = driver.findElement(By.xpath("(//div[@class='product-price-row clearfix'])[1]")).getText();
		System.out.println("The lowest prize after sort :"+lowPrize);
		
//			8. Select any price range ex:(500-700).
		
		
		Thread.sleep(5000);
		WebElement scroll = driver.findElement(By.xpath("//div[@class='price-text-box']/input"));
		act.scrollToElement(scroll).perform();
		driver.findElement(By.xpath("//div[@class='price-text-box']/input")).clear();
		driver.findElement(By.xpath("//div[@class='price-text-box']/input")).sendKeys("500");
		
		driver.findElement(By.xpath("(//div[@class='price-text-box']/input)[2]")).clear();
		driver.findElement(By.xpath("(//div[@class='price-text-box']/input)[2]")).sendKeys("700");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		
//			9. Filter by any colour.
		Thread.sleep(3000);
		WebElement colour = driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list ']/label"));
		act.scrollToElement(colour).perform();
		driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list ']/label")).click();
		
//			10. Verify all the applied filters.
		
		String filter = driver.findElement(By.xpath("//div[@class='filters']")).getText();
		
		System.out.println("The applied filters are: "+filter);
		
		if(filter.contains("White")) {
			System.out.println("colour filter is applied");
		}
		else {
			System.out.println("colour filter not applied");
		}
		
//			11. Mouse hover on the first resulting "Training Shoes".
		
		WebElement finalShoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(finalShoe).perform();
		
//			12. Click the "Quick View" button.
		
		driver.findElement(By.xpath("//img[@class='product-image wooble']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allAddress=new ArrayList<>(windowHandles);
		
		String childAddress = allAddress.get(1);
		
		driver.switchTo().window(childAddress);
		
		
		
//			13. Print the cost and the discount percentage.
		
		String finalPrize = driver.findElement(By.xpath("//span[@class='pdp-final-price']")).getText();
		System.out.println("The final prize is: "+finalPrize);
		
		String discount = driver.findElement(By.xpath("//span[@class='pdpDiscount ']")).getText();
		System.out.println("The discount is: "+discount);
		
//			14. Take a snapshot of the shoes.
		
		WebElement img = driver.findElement(By.xpath("//img[@class='cloudzoom']"));
		File source = img.getScreenshotAs(OutputType.FILE);
		File destination=new File("./img/Snapdeal.png");
		
		FileUtils.copyFile(source, destination);
//			15. Close the current window.
		
		driver.close();
//			16. Close the main window.
		driver.switchTo().window(allAddress.get(0));
		driver.close();

	}

}
