package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesNew 
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	Thread.sleep(1000);
	
	String mainPageText = driver.findElement(By.xpath(h1[contains(text(),'Frames Examples')]))
	
	////h1[contains(text(),'Frames Examples')]
	
	driver.switchTo().frame("frame1");//switching 
	
}
	
	
	
}
