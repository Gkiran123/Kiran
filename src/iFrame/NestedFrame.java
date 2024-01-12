package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		
		//we are on main page ---> need to change focus from main page to outer frame
		
		Thread.sleep(100);
		
		driver.findElement(By.tagName("iframe")).si
		
		driver.switchTo().frame(0);//outer frame or first frame
		Thread.sleep(100);
		driver.switchTo().frame(1);//inner frame
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("inner frame example");
		
		
	}
	
	
	
}
