package misc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws IOException
	{


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		CommonlyUsedMethods.takeScreenshot(driver,"AmazonTests");
		WebElement Work_from_home_essentials=driver.findElement(By.xpath("//h2[text()='Work from home essentials']"));
		CommonlyUsedMethods.scrollIntoView1(driver, Work_from_home_essentials);
//		String myData = CommonlyUsedMethods.readDataFromExcel(1, 1);
//		System.out.println(myData);
//		
		
	}

}
