package selenium_Practice_4_dec_2023;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class AlertPopUp1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		Thread.sleep(10000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make();
		File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Practice"+str+".jpg");
		FileHandler.copy(src, dest);
//		Thread.sleep(5000);
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(10000);
//		alt.dismiss();
		
		
		
		
		
		
		
		
		
	}

}
