package coverFox;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass_Execution 
{
  
	WebDriver driver;
	CoverFoxHomePage_1 home;
	Coverfox_health_plan_2 health;
	Coverfox_health_plan_member_details_3 member_Details;
	Coverfox_health_plan_address_details_4 address_Details;
	Coverfox_health_plan_results_5 plan_Results;
	
	
@BeforeClass
public void launching_Browser()
{
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.coverfox.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


}
	
@BeforeMethod
public void enter_Details() throws InterruptedException
{
home=new CoverFoxHomePage_1(driver);
home.clickOnMaleButton();
Thread.sleep(1000);

health=new Coverfox_health_plan_2(driver);
health.clickOnNextButton();
Thread.sleep(1000);

member_Details=new Coverfox_health_plan_member_details_3(driver);
member_Details.selectAge("30");
member_Details.clickOnNextButton();
Thread.sleep(1000);

address_Details=new Coverfox_health_plan_address_details_4(driver);
address_Details.enter_mobileNumber("9999999999");
address_Details.enter_Pincode("431401");
address_Details.clickOnContinueButton();
Thread.sleep(1000);
	
}


@Test
  public void f() throws InterruptedException 
  {
	
	Thread.sleep(5000);
	
	plan_Results=new Coverfox_health_plan_results_5(driver);
	int num2 = plan_Results.available_Number_On_Banner();
	Thread.sleep(10000);
	int num3 = plan_Results.available_Number_On_Text();
	Thread.sleep(10000);

	Assert.assertEquals(num2,num3,"Number on banner doesn't match number on text");
	
  }




}
