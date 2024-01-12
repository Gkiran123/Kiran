package testNG;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import myselenium.dropDown;

public class SoftAssert1 {
//  @BeforeMethod
//  public void instaLogin() 
//  {
//  WebDriver driver = new ChromeDriver();
//  driver.manage().window().maximize();
//  driver.get("https://www.facebook.com/");
//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//  
//  
// WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
// 
// createNewAccount.click();
//   
//  }
  
//  @Test
//  public void signUp(WebDriver driver)
//  {
//	  
//	  WebElement femaleRadioButton = driver.findElement(By.id("u_8_4_wd"));
//	  
//	  SoftAssert s =new SoftAssert();
//	  s.assertFalse(false);
//	  
//	  
//	  
//	  
//  }  
  
  @Test
  public void f()
  {
	  
	  String a="Veera";
	  String city= "Pune";
	  String b="Veera";
	  String c=null;
	  
	  SoftAssert s1 = new SoftAssert();
	  s1.assertEquals(a,b,"a and b are not equal TC is failed");
	  
	  s1.assertNull(c,"c is not null TC is fail");
	  
	  s1.assertAll();
	  
	 
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
