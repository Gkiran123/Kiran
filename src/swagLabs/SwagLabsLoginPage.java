package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{

	//1.Variables-->WebElements
	//userName,password,loginButton
	
	int a=10;
	
	@FindBy (name = "user-name") private WebElement userNameField;
	//driver.findElements();
	
	@FindBy (id = "password") private WebElement passwordField;
	@FindBy(xpath = "//input[@class='submit-button btn_action']") private WebElement loginButton;
	
	
	//@FindBy is same as findElement because we are not using WebDriver
	//private WebElement user_name=driver.findElement(By.name("user-name"));
	
	//2.Constructor
	public SwagLabsLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	
	//3.Methods
	
	public void enterUserName()
	{
		userNameField.sendKeys("standard_user");
		
	}
	
	public void enterPassword()
	{
		passwordField.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.ini
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
