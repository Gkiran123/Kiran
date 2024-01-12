package practice_Purpose;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotPractice 
{

	public static void main(String[] args) throws IOException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		String str = RandomString.make(2);
		
		File destn = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Facebook_Image1"+str+".png");
		
		FileHandler.copy(source,destn);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
