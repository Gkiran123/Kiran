package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame1 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		//switching focus 
		
		driver.switchTo().frame("singleframe");//if you don't add this line then it will throw no such element exception may be xpath wrong or synchronisation नाहीये means thread 
		String myTest = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		
		System.out.println("text is --->"+myTest);
		
		//to work 
		driver.switchTo().defaultContent();
		Thread.sleep(1000);//max is 7000 in company
		
		WebElement .findElement(By.xpath("//a[text()='Iframe with in an Iframe]"))
		
		
		System.out.println(button2.isDisplayed);
	}
	
	
}
