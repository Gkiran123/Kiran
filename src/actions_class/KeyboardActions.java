package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act= new Actions(driver);
		
		//act.click(day).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
//		
//		act.click(day).perform();
//		for(int i=0;i<=20;i++)//20 बार arrow up  करना है but not to enter each time  
//		{
//			act.sendKeys(Keys.ARROW_UP).perform();
//		}
//		act.sendKeys(Keys.ENTER).perform();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		//act.sendKeys(firstName, "VELOCITY").perform();
		
		//velocity
		
		act.keyDown(firstName, Keys.SHIFT).sendKeys("velocity").build().perform();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
