package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Practice {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		WebElement FeaturedCompanies = driver.findElement(By.xpath("//h2[text()='Featured companies actively hiring']"));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView();",FeaturedCompanies);
		
		Thread.sleep(1000);
		
		WebElement SponceredCompanies = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		js1.executeScript("arguments[0].scrollIntoView();",SponceredCompanies);
	
		
		

	}

}
