import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeTest 
{
  @Test
  public void f() 
  {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("");
  
  
   File src = ((Takescreenshot)driver).getscreenshotAs(OutputType.FILE);  
  
  
  
  }
}
