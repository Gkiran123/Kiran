package scrolling;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrolling_Practice1 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{


//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.naukri.com/");
//		Thread.sleep(1000);
//		
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,800)");
//		
//		Thread.sleep(5000);
//		
//		WebElement topCompanies = driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();",topCompanies);
//		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(1000);
		
		WebElement topCompanies = driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
		js.executeScript("arguments[0].scrollIntoView();",topCompanies);
		
		
		File scr = topCompanies.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Myimage.png");
		FileHandler.copy(scr, dest);
		
		
		
		
		
		
		

	}

}
