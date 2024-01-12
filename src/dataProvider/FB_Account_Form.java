package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_Account_Form 
{
	@Test(name="FBRegression",dataProviderClass = FBDataProvider.class)
  
  public void f(String firstname,String lastname,String MobNum) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("");
	  Thread.sleep(500);
	  
	  driver.findElement(By.linkText("Create new account")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  driver.findElement(By.name("lastname")).sendKeys();
	  driver.findElement(By.name("reg_email")).sendKeys();
	  Thread.sleep(4500);
	  driver.close();
		  
  }
  
}
