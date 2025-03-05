package week3.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		// Click the "Leads" link
		driver.findElement(By.linkText("Leads")).click();
		
		// Click "Find leads"
		driver.findElement(By.linkText("Find Leads")).click();
		
		Thread.sleep(2000);
		
		// Click on the "Phone" tab
		driver.findElement(By.linkText("Phone")).click();
		
		// Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123");
		
		// Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		// Capture the lead ID of the first resulting lead
		String leadId=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println("Lead id is: "+leadId);
		
		// Click the first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		// Click the "Delete" button
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		// Click "Find leads" again
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		
		// Enter the captured lead ID
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen246']/input")).sendKeys(leadId);
		
		// Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		// Verify the presence of the message "No records to display" in the Lead List.
				// This message confirms the successful deletion.
		
		String text = driver.findElement(By.className("x-paging-info")).getText();
		
		if (text.equals("No records to display")) {
			System.out.println("The record get deleted");
		}
		else {
				System.out.println("not deleted");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		}
}
