package myselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc1 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(100);
		driver.findElement(By.name("p")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.xpath("(//div[@class='sa-list-ctn'])[1]/ul/li"));
		Thread.sleep(1000);
		System.out.println("============Using For Each Loop===================");
		for (WebElement s:searchResult) 
		{
		System.out.println(s.getText());	
		}
		Thread.sleep(1000);
		System.out.println("================================");
		String expected_Result = "honda elevate 2023";
		for (WebElement sr1 : searchResult) 
		{
		String actual_Result = sr1.getText();
		if(actual_Result.equals(expected_Result))
		{
				sr1.click();
				break;
		}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@role='tab'])[2]")).click();
	}

}
