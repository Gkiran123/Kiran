package drop_Down_Practie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_DropDown {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement dropDown = driver.findElement(By.id("month"));
		dropDown.click();
		
		Select select = new Select(dropDown);
		
		//select.selectByVisibleText("Jan");
		
		//select.selectByIndex(0);
		
		select.selectByValue("1");
		
		if(select.isMultiple())
		{
			System.out.println("dropDown has multiple selectable options");
		}
		else
		{
			System.out.println("dropDown is multiple selectable options");
		}
		
		
		
		
		
		
		
		
	}

}
