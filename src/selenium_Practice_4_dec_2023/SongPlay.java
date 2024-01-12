package selenium_Practice_4_dec_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SongPlay 
{

	public static void main(String[] args) 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiosaavn.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.xpath("//input[@class='rbt-input-main form-control rbt-input']")).sendKeys("bekhayali");
		
		
		
		driver.findElement(By.xpath("(//a[text()='Bekhayali'])[1]")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Play']")).click();
		
		
		
		
		
		
		
	}

}
