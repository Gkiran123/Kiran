package coverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage_1 
{

	@FindBy(xpath = "//div[text()='Male']") private WebElement maleButton;
	
	public CoverFoxHomePage_1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnMaleButton()
	{
		maleButton.click();
	}
	
	
	
	
	
	
	
	
	
}
