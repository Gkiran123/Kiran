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
import scrolling.ScrollIntoView;

public class RadioButton_DropDowm {

	public static void main(String[] args) throws IOException 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement radioButton = driver.findElement(By.id("male"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",radioButton);//be careful while writing this sytax-sometimes comma,fullstop and semicolan,double quotes and aplhabet capital or small and sometimes paranthesis is missing
		
		
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
		driver.findElement(By.xpath("//label[text()='Monday']")).click();
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str = RandomString.make();
		
		File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Image0"+str+".jpg");
		FileHandler.copy(src, dest);
		
		
		
		
		
		
		
		
		
		
		
	}

}
