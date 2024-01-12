package selenium_Practice_4_dec_2023;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Hidden_Division_PopUp {

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
			
		WebElement popUp_Window = driver.findElement(By.xpath("//div[@class='JFPqaw']"));
		
		File source1 = popUp_Window.getScreenshotAs(OutputType.FILE);
		
		String str3 = RandomString.make(4);
		
		File dest2= new File("C:\\Users\\MY\\Desktop\\ScreenShot\\Yuheshwari"+str3+".jpg");
		
		FileHandler.copy(source1, dest2);
		
//		File dest1 = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\PopupImage.jpg");
//		
//		FileHandler.copy(source1, dest1);
		
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("gkarankk@gmail.com");//if not able to execute the code then change the xpath
//		
//		
//		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		
		
		//div[@class='JFPqaw']
		
		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		String str = RandomString.make(1);
//		
//		File dest = new File("C:\\Users\\MY\\Desktop\\ScreenShot\\FlipkartImage"+str+".jpg");
//		
//		FileHandler.copy(source, dest);
		
	
		
		
		
	}

}
