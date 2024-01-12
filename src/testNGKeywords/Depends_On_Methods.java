package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Methods 
{
  @Test
  public void payment() 
  {
  Reporter.log("Payment Done", true);
  }
  
  
  @Test
  public void couponCode1() 
  {
  Reporter.log("discount is used", true);
  }
 
  
  @Test(timeOut = 30)
  public void couponCode2() 
  {
  Reporter.log("50% discount is done", true);
  }
  
  @Test(dependsOnMethods = {"couponCode2"})
  public void discount() 
  {
  Reporter.log("discount is used", true);
  }
  
  
  
  
  
}
