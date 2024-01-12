package selenium_Practice_4_dec_2023;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBrowserWindowHandle 
{

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds+" ");
		
		Iterator<String> it = allIds.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Kiran");
		
		
		
		
		
		
		
	}

}
