package popUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_Up {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		
		driver.findElement(By.name("q")).sendKeys("honda");
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("(//*[@class='OBMEnb'])[1]/ul/li"));
		
		                      
		
		
		

	}

}
