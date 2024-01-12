package popUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		WebElement mainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println("Main page text is "+mainPageElement.getText());
		
		System.out.println("======================================================");
		
		driver.findElement(By.name("NewWindow")).click();
		
		String mainPageID = driver.getWindowHandle();
		System.out.println("Main page ID is "+mainPageID);
		
		System.out.println("======================================================");
		
		Set<String> allwindowID = driver.getWindowHandles();
		System.out.println("all window ID is "+allwindowID);
		
		System.out.println("======================================================");
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
