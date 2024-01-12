package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass2 {
  @Test
  public void myMethod() 
  {
	  System.out.println("Hi this is printing statement");//will not display the message in the console
	  Reporter.log("Hi this is Reporter without boolean parameter");//will display message in the emailable report but not in console 
	  Reporter.log("Hi this is Reporter,with boolean parameter",true);//will display message both in the emailable report and also in the console
	  
	  
	  
	  
  
  
  
  
  }
}
