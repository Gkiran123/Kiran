package practice_Purpose;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildWindowPractice {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.name("NewWindow")).click();
		
		Thread.sleep(1000);
		
		Set<String> allWindosID = driver.getWindowHandles();
		System.out.println(allWindosID);
		
		Iterator<String> it = allWindosID.iterator();
		String mainPageId = it.next();
		
		String childPageId = it.next();
		
		driver.switchTo().window(childPageId); 
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.id("the7-search")).sendKeys("Kiran");
		
		driver.switchTo().window(mainPageId);		
		WebElement mainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		
		System.out.println("Main Page Text "+mainPageElement.getText());
		
		
	}

}
