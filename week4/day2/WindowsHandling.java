package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
		
		Set<String> windowAddress = driver.getWindowHandles();
		
		List<String> addressList=new ArrayList<String>(windowAddress);
		
		String address = addressList.get(1);
		
		String parentTitle = driver.getTitle();
		
		System.out.println("The parent title is: "+parentTitle);
		
		driver.switchTo().window(address);
		
		String childTitle = driver.getTitle();
		
		System.out.println("The child title is: "+childTitle);
		
		driver.switchTo().window(addressList.get(0));
		
		driver.close();

	}

}
