package selenium_Practice_4_dec_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_and_TakeScreenShot {

	public static void main(String[] args) 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiosaavn.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		driver.findElement(By.xpath("(//i[@class='o-icon-play o-icon--large'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
