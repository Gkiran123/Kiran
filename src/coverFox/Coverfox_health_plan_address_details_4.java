package coverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coverfox_health_plan_address_details_4 
{

	@FindBy(xpath="//input[@placeholder='6 Digit Pincode']") private WebElement pincode;
	
	@FindBy(xpath="//input[@placeholder='Your mobile number']") private WebElement mobileNumber;
	
	@FindBy(xpath="//div[text()='Continue']") private WebElement continueButton;
	
	public Coverfox_health_plan_address_details_4(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enter_Pincode(String pin)
	{
		pincode.sendKeys(pin);
	}
	
	public void enter_mobileNumber(String mobile)
	{
		mobileNumber.sendKeys(mobile);
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	
}
