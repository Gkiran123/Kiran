package practice_Purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramePractice 
{

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		WebElement mainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println(mainPageElement.getText());
		
		driver.findElement(By.name("NewWindow")).click();
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.name("s")).sendKeys("Kiran");
		
		
		
		
		
		
		
		
		
		

	}

}
