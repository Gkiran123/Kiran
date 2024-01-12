package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);		
		
		driver.navigate().refresh();
		
		driver.quit();
		
		//driver.close();
	}

}
