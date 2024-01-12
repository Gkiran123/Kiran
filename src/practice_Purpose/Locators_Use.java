package practice_Purpose;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Locators_Use {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		String str = RandomString.make();
		
		File destination = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Image"+str+".png");
		
		FileHandler.copy(source, destination);
		
		driver.close();
		
		
		
		
		
		
	}

}
