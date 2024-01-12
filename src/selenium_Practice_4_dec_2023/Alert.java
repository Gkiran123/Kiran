package selenium_Practice_4_dec_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		Thread.sleep(1000);
		
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
