package selenium_Practice_4_dec_2023;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class GetWindowHandleonVegaMovies {

	public static void main(String[] args) throws IOException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vegamovies.ec/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.xpath("//img[@alt='Detective Knight Rogue 2022 Hindi Dual Audio HDRip 720p – 480p']")).click();
		
		WebElement scrolling = driver.findElement(By.xpath("//mark[text()='—–== Download Links ==—–']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",scrolling);
		
		driver.findElement(By.xpath("(//button[@class='dwd-button'])[1]")).click();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str = RandomString.make(2);
		
		File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Movie_Image"+str+".jpg");
		FileHandler.copy(src, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
