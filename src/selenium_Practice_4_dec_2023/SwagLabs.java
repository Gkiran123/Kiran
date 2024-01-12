package selenium_Practice_4_dec_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) 
	{


		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/inventory.html");
		
		
		WebElement Sauce_Labs_Backpack = driver.findElement(By.xpath("https://www.saucedemo.com/inventory.html"));
		
		Sauce_Labs_Backpack.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
