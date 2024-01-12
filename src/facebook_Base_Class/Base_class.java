package facebook_Base_Class;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import myselenium.dropDown;

public class Base_class 
{

	WebDriver driver;
	
	
	public void launchingBrowser()
	{
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Reporter.log("Browser is launched", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		
	}
	
	public void closing_Browser()
	{
		Reporter.log("closing the browser", true);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
