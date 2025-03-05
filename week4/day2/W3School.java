package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//load URL
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//maximize webpage
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		//switch to frame window
		
		driver.switchTo().frame(frame);
		
		//click the try it button
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//alert handling
		
		driver.switchTo().alert().sendKeys("Karthikeyan");
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		//get text from alert
		
		String alertText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("The text shown as: "+alertText);
		
		if (alertText.contains("cancelled")) {
			System.out.println("The alert was dismissed");
		}
		else if (alertText.contains("How are you today")) {
		System.out.println("The alert was accepted");
		}
		

	}

}
