package practice_Purpose;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.TakesScreenshot;


public class PracticeOfAll {

	public static void main(String[] args) throws IOException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str = RandomString.make(1);
		
		File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Flipkart"+str+".jpg");
		
		FileHandler.copy(src,dest);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
