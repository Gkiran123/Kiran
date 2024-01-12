package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_Url_Use {

	public static void main(String[] args) 
	{
		String expectedCurrentUrl = "https://www.flipkart.com/";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedCurrentUrl.equals(actualUrl))
		{
			System.out.println("Got the expectedUrl");
		}
		else
		{
			System.out.println("not get expected Url");
		}
	}

}
