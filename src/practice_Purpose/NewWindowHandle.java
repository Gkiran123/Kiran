package practice_Purpose;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		
		
		WebElement MNC = driver.findElement(By.xpath("//span[@title='MNC']"));
		MNC.click();
		
		
		
//		WebElement humanResources = driver.findElement(By.xpath("//span[@title='HR']"));
//		humanResources.click();
//		
//	
//		
//		WebElement dataScience = driver.findElement(By.xpath("//span[@title='Data Science']"));
//		dataScience.click();
//		
		
		
		Set<String> IdOfAllPages = driver.getWindowHandles();
		
		ArrayList al=new ArrayList(IdOfAllPages);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
