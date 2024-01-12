package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MixedKeywords 

{
  @Test(priority = -1,dependsOnMethods = {"d"})
  public void a() 
  {
  Reporter.log("TC a is running", true);
  }
  
  @Test
  public void b() 
  {
  Reporter.log("TC a is running", true);
  }
  
  @Test
  public void c() 
  {
  Reporter.log("TC a is running", true);
  }
  
  @Test(invocationCount = 3)
  public void d() 
  {
  Reporter.log("TC a is running", true);
  }
}
