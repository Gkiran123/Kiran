package coverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Coverfox_health_plan_member_details_3 
{

	@FindBy(id = "Age-You") private WebElement age;
	@FindBy(xpath = "//div[@class='next-btn']") private WebElement nextbutton;
	
	public Coverfox_health_plan_member_details_3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectAge(String Age)
	{
		Select s = new Select(age);
		s.selectByValue(Age+"y");
		
	}
	
	public void clickOnNextButton()
	{
		nextbutton.click();
	}
	
}
