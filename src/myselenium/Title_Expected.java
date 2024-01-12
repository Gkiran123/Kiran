package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Title_Expected 
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println("Title is--->"+Title);
		
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("You got the expected Title");
		}
		else
		{
			System.out.println("You are not getting the expected Title");
		}
		
		Thread.sleep(1000);
		driver.close();
		
		
	}
	
}
