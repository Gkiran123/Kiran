package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude_2 
{
	@Test(groups="Sanity")
	  public void e() 
	  {
		  Reporter.log("TC e is running", true);
	  }
	  
	  
	  @Test(groups={"Sanity","Regression"})
	  public void f() 
	  {
		  Reporter.log("TC f is running", true);
	  }
	  
	  @Test(groups="Regression")
	  public void g() 
	  {
		  Reporter.log("TC g is running", true);
	  }
	  
	  @Test(groups="Sanity")
	  public void h() 
	  {
		  Reporter.log("TC h is running", true);
	  }
	  
	  
	  
  
  
}
