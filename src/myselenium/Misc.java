package myselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc {

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(1000);
		driver.findElement(By.name("p")).sendKeys("honda");
		Thread.sleep(1000);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("//div[@class='sa-list-ctn']"));
		
		
		
		
		
		
		
		
	}

}
