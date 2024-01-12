package practice_Purpose;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Excel {

	public static void main(String[] args)
	{
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/demo-site/");
		
		
		
	
		
		WebElement country = driver.findElement(By.xpath("(//span[@role='combobox'])[1]"));
		
		
		
		Select s= new Select(country);
		s.selectByVisibleText("India");
		
		
		
	}
	
	
	
	
}