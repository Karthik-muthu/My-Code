package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		//load URL

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		//maximize webpage

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//switch to iframe
		driver.switchTo().frame("iframeResult");
		
		//click the button
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Alert handing
		
		driver.switchTo().alert().sendKeys("Karthikeyan");
		driver.switchTo().alert().accept();
		String result = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		System.out.println(result);

	}

}
