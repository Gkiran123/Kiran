package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.css.CSS.TakeCoverageDeltaResponse;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_Practice {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gkarankk@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kiran1@");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		
		
		
		Thread.sleep(1000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		Thread.sleep(1000);
		String str = RandomString.make();
		Thread.sleep(1000);
		File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Image1"+str+".png");
		
		FileHandler.copy(source, dest);
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
