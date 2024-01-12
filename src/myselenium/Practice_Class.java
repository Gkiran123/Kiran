package myselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Class {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(100);

		
		//driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Mumbai");
		
		//Thread.sleep(100);

		//driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
		//Thread.sleep(100);
		
		
//		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Pune");
//		
//		Thread.sleep(100);
//		
//		driver.findElement(By.xpath("//img[@alt='PUNE']")).click();
//		
//		
//		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
//		
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Search for Movies, Events, Plays, Sports')]")).click();
		
		//driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Pune");
		
		//driver.findElement(By.linkText("Pune"));
		
		//driver.findElement(By.xpath("//input[@value='pune']")).click();
		
		
		
//driver.findElement(By.xpath("//input[contains (@placeholder,'Search for')]")).sendKeys("Pune");
//		
//		driver.navigate().to("https://www.redbus.in/");
//		
//		driver.findElement(By.xpath("//h1[contains(text(),'Ticket Booking')]")).click();
//		
		
		//driver.close();
		
//		driver.findElement(By.xpath("https://en-gb.facebook.com/login/")).sendKeys("Kiranghandge5@gmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Pune");
		
		
		
	}

}
