package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();
		

		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> address=new ArrayList<String>(windowHandles);
		
		String childAddress = address.get(1);
		System.out.println("Address of child window: "+childAddress);
		
		String mainAddress = address.get(0);
		System.out.println("Address of Parent window: "+mainAddress);
		
		driver.switchTo().window(childAddress);
		
		Thread.sleep(3000);
		String currentWindowAddress = driver.getWindowHandle();
		
		System.out.println("Current address: "+currentWindowAddress);
		
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.switchTo().window(mainAddress);
		
		
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();
		
       Set<String> windowHandles1 = driver.getWindowHandles();
		
		List<String> address1=new ArrayList<String>(windowHandles1);
		
		String childAddress1 = address1.get(1);
		System.out.println("Address of child window1: "+childAddress1);
		
		String mainAddress1 = address1.get(0);
		System.out.println("Address of Parent window1: "+mainAddress1);
		
		driver.switchTo().window(childAddress1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
		driver.switchTo().window(mainAddress1);
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		String pageTitle = driver.getTitle();
		
		System.out.println("Title of the page is: "+pageTitle);
	}

}
