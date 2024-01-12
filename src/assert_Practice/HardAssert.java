package assert_Practice;


import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
  @Test
  public void f() 
  {
  
	  String a="hi";
	  String b="hi";
	  
	  Assert.assertEquals(a,b,"a and b are not equal,TC is failed");
	  
	  Assert.assertNotNull(a,"a is null,TC is failed");
	  
  }
  @Test
  public void m()
  {
	  String a=null;
	  Assert.assertNull(a);
  }
  }



