package selenium_Practice_4_dec_2023;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		WebElement table1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]/td[1]"));
				
		System.out.println(table1.getText());
		
		System.out.println("=================================");
		
		List<WebElement> table2 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[4]/td"));
		
		for(WebElement r:table2)
		{
			System.out.print(r.getText()+" ");
		}
		System.out.println();
		System.out.println("=================================");
		
	
		WebElement table4 = driver.findElement(By.xpath("//table[@name='BookTable']//th[4]"));
		
		System.out.println(table4.getText());
		
		for(int i=2;i<=7;i++)
		{
			WebElement table3 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
			
			System.out.println(table3.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
