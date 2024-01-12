import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Practice 
{
public static void main(String[] args) 
{

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("");
	
	String str = RandomString.make();
	
	File dest = new File("");
	
	driver.switchTo().frame("");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript(str, args);
	
	
}
}
