package selenium_Practice_4_dec_2023;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Alert_NewWindow_Screenshot_ 
{

	public static void main(String[] args) throws IOException 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Alert A1 = driver.switchTo().alert();
		A1.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert A2 = driver.switchTo().alert();
		A2.accept();
		
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		Alert A3 = driver.switchTo().alert();
		A3.accept();
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str = RandomString.make(1);
		
		File dest= new File("C:\\Users\\MY\\Desktop\\ScreenShot\\MastarMakude"+str+".jpg");
		
		FileHandler.copy(src, dest);
		
		
		
		
		
		
	}

}
