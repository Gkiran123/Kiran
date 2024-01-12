package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class 
{

	public static void main(String[] args) 
	{
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.name("login")).click();
		
		//1.find out the locator of webelement where we need to perform action and store in some reference variable
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		
		
		//2.create an object of action class which will accept driver object as a parameter 
				
				Actions act = new Actions(driver);//driver focuses on webpage..action लेणी है तो driver का use करते है 
		//3.using one of the actions class methods perform an action
				
		//act.moveToElement(loginbutton).perform();//interview question what is the use of perform method? 
		//act.click().perform();//click method without parameter method---
		
		//act.moveToElement(loginbutton).click().build().perform();//build is used while doing method chaining
		
		
		act.click(loginbutton).perform();//click method with parameter method--compile time polymorphisim
		
		
		
		
		
	}

}
