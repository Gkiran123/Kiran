package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println("Title is---->"+Title);
		
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("not correct");
		}
		
		driver.close();
	}

}
