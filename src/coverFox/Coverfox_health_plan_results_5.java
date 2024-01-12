package coverFox;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Coverfox_health_plan_results_5 
{

	@FindBy(xpath="//div[text()='49 matching Health Insurance Plans']") private WebElement plans;
	
	@FindBy(id = "Plans-list") private List<WebElement> plansList;
	
	public Coverfox_health_plan_results_5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public int available_Number_On_Text()
	{
		String test = plans.getText();
		
		String ar[]=test.split(" ");
		
		String numberInString = ar[0];
		
		int num=Integer.parseInt(numberInString);
		
		return num;
		
		
	}
	
	
	public int available_Number_On_Banner()
	{
		int num1 = plansList.size();
		return num1;
	}
	
	
	
	
	
	
	
	
	
	
}
