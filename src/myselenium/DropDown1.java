package myselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='month']"));
		
		Thread.sleep(1000);

		Select s = new Select(dropdown);

		Thread.sleep(1000);

		
		s.selectByVisibleText("Jan");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
