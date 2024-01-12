package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDoubleClick 
{

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//example for right click(context click)
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		
		//act.contextClick(rightClickButton).perform();
		
		//example for double click
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Actions act1 = new Actions(driver);/////गरज नाहीए हे तयार करायची अगोदरच केले आहे परत परत करायची गरज नाहीये 
		//act1.doubleClick(doubleClickButton);
		
		act1.moveToElement(doubleClickButton).doubleClick().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
