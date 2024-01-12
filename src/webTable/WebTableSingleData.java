package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSingleData {

	public static void main(String[] args) 
	{


		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement text1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[2]"));
		
		//only one element from the header
		System.out.println(text1.getText());
		
		System.out.println("=================================================");
		
		//whole row of header
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));//for each loop,iterator,
		//continuation nahi pahije mag iterator use karne-वेग वेगळ काम करायच आहे तेव्हा iterator use करणे 
		//for each loop-same kaam karaych aahe eka nantar ek mag for each loop use karne(for each loop also known as advanced/enhanced loop ).start to end same kaam karaych aahe tevha for each loop use karne
		
		for(WebElement th:tableHeader)//tableHeader is a object of a collection class which is stored in a "th" variable
		{
			System.out.print(th.getText()+" ");
		}
		System.out.println();
		System.out.println("=================================================");
		
		
		WebElement singleElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[3]"));
		
		
		System.out.println(singleElement.getText());
		
		System.out.println("================================");

		
		//how to read whole data 
		
		List<WebElement> row3 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]/td"));
		
		for(WebElement r:row3)//for each loop is used to print collection which is string of elements(for rows only)
		{
			System.out.print(r.getText()+" ");
		}
			
		System.out.println();
		System.out.println("================================");
			
			
			
		//read complete single column
					
			for(int i=2;i<=7;i++)//initial value of i is 2
			{
				WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));//focus more on xpath of this-"tr" varying here
				System.out.println(data.getText()+" ");
			}
			
			System.out.println("================================");
			
			
			
			
			
			
			
		
	}

}
