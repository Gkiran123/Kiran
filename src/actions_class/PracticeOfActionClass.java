package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeOfActionClass 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//driver.get("https://www.facebook.com/");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		Actions act = new Actions(driver);
		
		//WebElement rightCliq = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//act.contextClick(rightCliq).perform();
		
//		WebElement doubleCliq = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		act.doubleClick(doubleCliq).perform();
		
		
//		WebElement loginButtonCliq = driver.findElement(By.name("login"));
//		act.moveToElement(loginButtonCliq).click().perform();//without using build
//		
		
		
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
//		Actions act = new Actions(driver);
//			
//		
//		act.dragAndDrop(source, target).perform();
//		
		
//		WebElement sunday = driver.findElement(By.id("sunday"));
//		WebElement monday = driver.findElement(By.id("monday"));
//		WebElement friday = driver.findElement(By.id("friday"));
//		
//		Actions act = new Actions(driver);
//		
//		act.scrollToElement(friday).perform();
//		
//		sunday.click();
//		monday.click();
//		friday.click();
//		
		
		WebElement slider1 = driver.findElement(By.id("slider"));
		act.scrollToElement(slider1).perform();
		act.dragAndDropBy(slider1, 70, 0).perform();
		
		
		
	}

}
