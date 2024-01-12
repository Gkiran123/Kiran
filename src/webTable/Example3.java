package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) 
	{


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=4;j++)//inner for loop-->for columns-->4
			{
				if(i==1) 
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/td[1]"));
					System.out.println();
					
				}
				else
				{
					driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
				}
			}
			System.out.println();
			System.out.println("=====================================");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
