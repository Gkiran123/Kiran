package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamplePractice 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		Thread.sleep(1000);
				
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("Kiran");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
