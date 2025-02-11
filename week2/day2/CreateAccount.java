package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
		WebElement source = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industry=new Select(source);
		industry.selectByVisibleText("Computer Software");
		
		Select owner=new Select(driver.findElement(By.xpath("//select[@name='ownershipEnumId']")));
		owner.selectByVisibleText("S-Corporation");
		
		Select source1=new Select(driver.findElement(By.id("dataSourceId")));
		source1.selectByValue("LEAD_EMPLOYEE");
		
		Select marketing=new Select(driver.findElement(By.id("marketingCampaignId")));
		marketing.selectByIndex(6);
		
		Select state=new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		state.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(50000);
		driver.close();
		
	}

}
