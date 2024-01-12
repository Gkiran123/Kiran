package exrecise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.igsindia.org.in/");
		
	
		driver.findElement(By.xpath("(//a[@class='btn btn-primary px-4 py-3'])[5]")).click();
		
		//driver.findElement(By.xpath("(//a[@class='btn btn-primary px-4 py-3'])[6]")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
