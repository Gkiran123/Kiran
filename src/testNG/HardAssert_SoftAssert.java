package testNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssert_SoftAssert 
{
  @Test
  public void instaLogin() 
  {
  
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.instagram.com/accounts/emailsignup/");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  
  
  WebElement SignUpButtonCheck = driver.findElement(By.xpath("//button[text()='Sign Up']"));
  boolean ButtonCheck = SignUpButtonCheck.isEnabled();
  System.out.println(ButtonCheck);
  
  
  
  
  
  
  
  
  }
}
