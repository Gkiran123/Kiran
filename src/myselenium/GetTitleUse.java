package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args) throws InterruptedException 
	{
	
		String expectedResult = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String Title = driver.getTitle();
		System.out.println("Title is--->"+Title);
		
		Thread.sleep(2000);

		
		
		String actualResult = driver.getTitle();
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		
		//driver.close();
	}

}
