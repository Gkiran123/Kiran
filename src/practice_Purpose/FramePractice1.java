package practice_Purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice1 {

	public static void main(String[] args) throws InterruptedException 
	{

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("fname")).sendKeys("Kiran");
		
		
		
		
		
		
//		driver.switchTo().frame("parent_iframe");
//		Thread.sleep(500);
//		driver.findElement(By.id("u_5_5")).click();
//		Thread.sleep(500);
//		driver.switchTo().frame("demo_frame1");
//		driver.findElement(By.id("u_5_6")).click();
		
		Thread.sleep(100000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
