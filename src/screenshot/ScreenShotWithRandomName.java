package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithRandomName 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);//एथे file temporary location ला जाईल  
		
		RandomString s = new RandomString();
		
		String rs = s.make(4);
		
		File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\myScreenShot"+rs+".png");
		
		FileHandler.copy(source, dest);
		
		
	}

}
