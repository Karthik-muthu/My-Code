package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Home_Assignments {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Karthik");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Keyan");
		WebElement selectDay = driver.findElement(By.id("day"));
		Select source1=new Select(selectDay);
		source1.selectByVisibleText("24");
		
		WebElement selectMonth = driver.findElement(By.id("month"));
		Select source2=new Select(selectMonth);
		source2.selectByVisibleText("Dec");
		
		WebElement selectYear = driver.findElement(By.id("year"));
		Select source3=new Select(selectYear);
		source3.selectByVisibleText("1999");
		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("karthikmuthuramalingam99@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Revathi00@");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(50000);
		driver.close();
		
	}

}
