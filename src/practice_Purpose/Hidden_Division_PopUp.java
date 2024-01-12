package practice_Purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_PopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("gkarankk@gmail.com");
		
		driver.findElement(By.xpath("//button[@class='_1wGnMD rX1XT4 _2nD2xJ']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
