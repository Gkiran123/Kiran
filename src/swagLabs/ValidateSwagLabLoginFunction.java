package swagLabs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateSwagLabLoginFunction {

	public static void main(String[] args) 
	{


		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//create object of POM class
		
		SwagLabsLoginPage login = new SwagLabsLoginPage(driver);
		
		login.enterUserName();
		login.enterPassword();
		login.clickOnLoginButton();
		
		
		
		
		
		
		
		
		
	}

}
