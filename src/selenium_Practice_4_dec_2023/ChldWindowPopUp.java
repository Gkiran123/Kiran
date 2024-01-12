package selenium_Practice_4_dec_2023;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChldWindowPopUp {

	public static void main(String[] args) 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		
		Set<String> idOfAll = driver.getWindowHandles();
		
		System.out.println(idOfAll);
		
		Iterator<String> it = idOfAll.iterator();
		
		
		String mainpage = it.next();
		
		String child = it.next();
		
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("search")).sendKeys("Kiran");
		
		
		
	}

}
