package facebook_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_POM_Login_Page 
{
	
@FindBy(xpath="//a[text()='Create new account']") private WebElement createNewAccountButton;

public Facebook_POM_Login_Page(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
	
public void click_On_createNewAccount()
{
	createNewAccountButton.click();
}
	
	
	
	
}
