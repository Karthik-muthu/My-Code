package week3.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		//Initialize the WebDriver (ChromeDriver).
				ChromeDriver driver=new ChromeDriver();
				
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				// maximize the browser
				driver.manage().window().maximize();
				
				// Enter the Username
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
				// Enter the Password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				// click the login button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				// Click the "crm/sfa" link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("test leaf");
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Karthik");
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Keyan");
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kavya");
				
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing dept");
				
				driver.findElement(By.id("createLeadForm_description")).sendKeys("testing dept is a good dept for IT industry");
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthikmuthuramalingam99@gmail.com");
				
				WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				Select source=new Select(dropDown);
				source.selectByVisibleText("Armed Forces Pacific");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
				
				
				driver.findElement(By.id("updateLeadForm_description")).clear();
				
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("testing dept is a good dept for IT industry");
				
				driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
				
				System.out.println("Page title is: "+driver.getTitle());
				
				driver.close();

	}

}
