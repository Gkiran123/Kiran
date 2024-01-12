package selenium_Practice_4_dec_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) throws InterruptedException 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://103.240.34.122:8085/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='btn sign-btn nav-link']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Swati");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
