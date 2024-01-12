package practice_Purpose;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp1 {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.name("NewWindow")).click();
		
		driver.findElement(By.id("the7-search")).sendKeys("Kiran");
		
		String mainPageId = driver.getWindowHandle();
		
		System.out.println("Main page Id is "+mainPageId);
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		Iterator<String> it = allWindowId.iterator();
		
		String mainPage = it.next();
		String childPage = it.next();
		
		Thread.sleep(1000);
		
		driver.switchTo().window(childPage);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("the7-search")).sendKeys("Kiran");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
