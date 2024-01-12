package coverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coverfox_health_plan_2 
{

	@FindBy(xpath = "//div[@class='next-btn']") private WebElement nextButton;
	
	public Coverfox_health_plan_2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNextButton()
	{
		nextButton.click();
	}
	
}
