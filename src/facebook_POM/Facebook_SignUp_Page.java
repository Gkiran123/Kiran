package facebook_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Facebook_SignUp_Page 
{

	
	@FindBy(name = "firstname") private WebElement firstNameField;
	@FindBy(name = "lastname") private WebElement surnameField;
	@FindBy(name = "reg_email__") private WebElement emailField;
	@FindBy(name = "reg_passwd__" ) private WebElement passwordField;
	@FindBy(id = "day") private WebElement dayField;
	@FindBy(id = "month") private WebElement monthField;
	@FindBy(id = "year") private WebElement yearField;
	@FindBy(id = "u_b_5_p") private WebElement maleButton;
	@FindBy(id = "u_b_s_O6") private WebElement signupButton;
	
	public Facebook_SignUp_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, true);
	}
	
	
	public void enterFirstName(String firstName)
	{
		firstNameField.sendKeys(firstName);
	}
	
	public void entersurnameName(String lastName)
	{
		surnameField.sendKeys(lastName);
	}
	
	public void enterEmail(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void enterday(String day)
	{
		Select s = new Select(dayField);
		s.selectByValue(day);
	}
	
	public void enterMonth(String Month)
	{
		Select s1 = new Select(monthField);
		s1.selectByValue(Month);
		
	}
	
	public void enterYear(String Year)
	{
		Select s2 = new Select(yearField);
		yearField.sendKeys(Year);
	}
	
	public void enterGender(String gender)
	{
		maleButton.click();
	}
	
	public void clickOnSignUpButton(String SignUp)
	{
		signupButton.click();
	}
	
	
	
	
	
}
