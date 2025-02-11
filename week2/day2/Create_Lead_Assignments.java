package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Lead_Assignments {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthik");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Assignment");
		
		Select source = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		source.selectByValue("LEAD_DIRECTMAIL");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
