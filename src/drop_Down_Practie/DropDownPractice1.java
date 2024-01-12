package drop_Down_Practie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice1 
{

	public static void main(String[] args) throws InterruptedException 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		Thread.sleep(1000);
				
		
		WebElement DropDown = driver.findElement(By.id("country"));
		Select s = new Select(DropDown);
		s.selectByVisibleText("Canada");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
