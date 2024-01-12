package synchronisation_Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://upstox.com/");
		//Thread.sleep(10000);//takes approximately 15 milli seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));//5s
		
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
