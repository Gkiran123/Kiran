package findBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{

	//1.Variable
	@FindBy(id = "user-name") private WebElement userName; 
	@FindBy(id = "password") private WebElement pass;
	@FindBy(id = "login-button") private WebElement clickLoginButton;
	
	//2.Constructor
	public SwagLabsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.Methods
	public void userName1()
	{
		userName.sendKeys("standard_user");
	}
	
	public void pass1()
	{
		pass.sendKeys("secret_sauce");
	}
	
	public void  clickOnButton()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
