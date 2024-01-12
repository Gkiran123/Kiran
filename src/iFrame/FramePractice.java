package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/nested-iframes-example/");

		Thread.sleep(1000);
				
		driver.switchTo().frame("demo_parent_iframe");
		
		driver.findElement(By.id("u_5_5")).click();
		
		driver.switchTo().frame("demo_frame1");
		driver.findElement(By.id("u_5_6")).click();
		
		
		
		
		
		
		
		
		
	}

}
