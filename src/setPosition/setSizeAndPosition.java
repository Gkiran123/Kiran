package setPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSizeAndPosition {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		
		Dimension defaultSize = driver.manage().window().getPosition();
		
		System.out.println(defaultSize);
		
		Dimension d=new Dimension(500, 100);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		
		
		
		
		
		
		
		
		
		
		
	}

}
