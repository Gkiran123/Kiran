package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrllingUsingActions {

	public static void main(String[] args) throws InterruptedException
	{
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement sunday = driver.findElement(By.id("sunday"));
		WebElement monday = driver.findElement(By.id("monday"));
		WebElement tuesday = driver.findElement(By.id("tuesday"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(sunday).perform();
		
		
		sunday.click();
		Thread.sleep(1000);
		monday.click();
		Thread.sleep(1000);
		tuesday.click();
		
		
		
		
		
		
		
		
	}

}
